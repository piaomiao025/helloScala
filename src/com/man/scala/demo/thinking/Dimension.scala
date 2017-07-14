package com.man.scala.demo.thinking
import com.man.scala.demo.thinking.AtomicTest._;

/**
  * User: MXQ
  * Date: 2017/7/12
  * Time: 18:06
  */
object Dimension extends App{
  class Dimension(var height: Int, var width: Int);
  val c = new Dimension(5, 7);
  c.height is 5;
  c.height = 10;
  c.height is 10;
  c.width = 19;
  c.width is 19;

  class Info(val name: String, var des: String);
  val info = new Info("stuff", "Something");
  info.name is "stuff";
  info.des is "Something";
  info.des = "Something else";
  info.des is "Something else";
}
