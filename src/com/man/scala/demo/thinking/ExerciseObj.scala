package com.man.scala.demo.thinking
import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/17
  * Time: 11:15
  */
object ExerciseObj extends App{
  class WalkActivity{
    def calories(lbs: Int, mins: Int, pph: Double = 3) = WalkActivity.calories(lbs, mins, pph)
  }
  object WalkActivity{
    var logInfo: String = "";
    def start(name: String) = {
      println(s"$name started!")
      logInfo += s"[$name] Activity started.\n"
    }
    def stop(name: String) = {
      println(s"$name stopped!")
      logInfo += s"[$name] Activity stoped.\n"
    }
    var MET: Double = 2.3;
    def calories(lbs: Int, mins: Int, pph: Double = 3): Long = math.round((MET * 3.5 * lbs * 0.45)/200.0 * mins)
  }
  WalkActivity.start("Jerry")
  WalkActivity.stop("Jerry")
  WalkActivity.start("Tom")
  WalkActivity.stop("Tom")
  println(WalkActivity.logInfo)

  val sally = new WalkActivity;
  sally.calories(150, 30) is 82;

  class WalkActivity2{
    def calories(lbs: Int, mins: Int, mph: Double = 3): Long = math.round((WalkActivity2.MET(mph) * 3.5 * lbs * 0.45)/200.0 * mins)
  }
  object WalkActivity2{
    def MET(mph: Double) = mph match{
      case x if(x < 1.7) => 2.3
      case x if(x < 2.5) => 2.9
      case x if(x < 3) => 3.3
      case x if(x >= 3) => 3.3
      case _ => 2.3
    }
  }


  WalkActivity2.MET(1.0) is 2.3;
  WalkActivity2.MET(2.7) is 3.3;
  val suzie = new WalkActivity2;
  suzie.calories(150, 30) is 117
  val john = new WalkActivity2;
  john.calories(150, 30, 1.5) is 82;
}
