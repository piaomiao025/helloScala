package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/12
  * Time: 11:51
  */
object TDDFail extends App{
  import com.man.scala.demo.thinking.AtomicTest._;
  calculateBMI(160, 68) is "Normal weight";
  calculateBMI(100, 68) is "Under weight";
  calculateBMI(200, 68) is "Over weight";

  def calculateBMI(lbs: Int, height: Int): String = {
    "Normal weight"
  }
  val v3 = Vector(1, 3, 4, 5, 6);
  println(v3.reverse);

  val v4 = Vector("twas", "brilling", "and", "slithy", "toves");
  println(v4.sorted);
  println(v4.tail);
  println(v4.head);

}
