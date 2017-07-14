package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/13
  * Time: 16:33
  */
object SimpleMap extends App{
  val v1 = Vector(1, 2, 3, 4);
  v1.map(n => n + 1) is Vector(2, 3, 4, 5);

  val v2 = Vector(1, 10, 100, 1000);
  v2.reduce((a, n) => a + n) is 1111;

  v1.map(n => 11 * n + 10) is Vector(21, 32, 43, 54);
  v1.foreach(n => 11 * n + 10) is Vector(21, 32, 43, 54);
//  var v3 = Vector[Int];
//  for{
//    i <- v1
//    i * 11 + 10
//  } yield i
//  v3
//  v3 is Vector(21, 32, 43, 54);
  def sumInt(args: Int*): Int ={
    args.reduce((sum, n) => sum + n);
  }

  sumInt(1, 2, 3) is 6;
  sumInt(45, 45, 45, 60) is 195;
}
