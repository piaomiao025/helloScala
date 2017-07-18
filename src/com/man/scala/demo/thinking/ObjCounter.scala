package com.man.scala.demo.thinking
import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/17
  * Time: 11:04
  */
object ObjCounter extends App{
  case class Count(){
    val id = Count.id();
    override def toString() = s"Count$id";
  }
  object Count{
    var n = -1;
    def id() = {
      n += 1
      n
    }
  }
//  Vector(new Count, new Count, new Count, new Count) is "Vector(Count0, Count1, Count2, Count3)"
  Vector(Count, Count, Count, Count) is "Vector(Count0, Count1, Count2, Count3)"


}
