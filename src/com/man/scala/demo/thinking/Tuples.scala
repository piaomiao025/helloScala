package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/14
  * Time: 17:31
  */
object Tuples extends App{
  def data2(input: Double): (Double, String) = {
    if(input > 5.0)
      (input * 2, "High")
    else
      (input * 2, "Low")
  }

  def data3(input: Double) = {
    if(input > 5.0)
      (input * 2, "High", true)
    else
      (input * 2, "low", false)
  }

  data2(7.0) is (14.0, "High");

  data3(7.0) is (14.0, "High", true)

  def f = (1, 3.14, "Mouse", false, "Altitude")
  val (n, d, a, b, h) = f
  val all = f
  (a, b, d, h, n) is ("Mouse")

  f._1 is 1;

  all._2 is "Mouse";

  case class Employee(name: String, ID: Int);
  val empA = Employee("Bob", 1130);
  val Employee(nm, id) = empA;
  nm is "Bob"

  var (a1, a2, a3) = (1.1, 12, "Hi");
  a1.getClass is Double.getClass
}
