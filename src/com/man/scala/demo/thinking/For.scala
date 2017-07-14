package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/14
  * Time: 16:12
  */
object For extends App{
  val r = Range(0, 9).inclusive;
  println(r.reduce((sum, n) => sum + n));
}
