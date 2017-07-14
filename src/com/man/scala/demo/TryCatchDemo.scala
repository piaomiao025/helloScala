package com.man.scala.demo

/**
  * User: MXQ
  * Date: 2017/7/7
  * Time: 17:29
  */
object TryCatchDemo extends App{
  val s = "a";
  var ret = "成功";
  try{
    val i = s.toInt;
    i / 0;
  }catch{
    case e: NumberFormatException => ret = "异常了";
    case e: Exception => e.printStackTrace();
    case t: Throwable => ret = "又异常了！"
  }

  println(s"执行结果为$ret");

  @throws(classOf[NullPointerException])
  def toInt(s: String): Option[Int] = {
    try{
      Some(s.toInt);
    }catch{
      case e: Exception => throw e;
    }
  }
//  println(toInt("a"));

  var list = List("a", "b", "c");
  list.filter(_ != "a").foreach(println);
}
