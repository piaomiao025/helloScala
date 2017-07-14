package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/13
  * Time: 17:36
  */
object Comprehension extends App{
  def evenGT5(v: Vector[Int]): Vector[Int] = {
    var result = Vector[Int]();
    for{
      n <- v
      if n > 5
      if n % 2 == 0
    } result = result :+ n
    result
  }

  val v = Vector(1, 2, 3, 4, 5, 6, 7, 8);
  evenGT5(v) is Vector(6, 8)

  def yielding(v: Vector[Int]): Vector[Int] = {
    val result = for {
      n <- v
      if n > 5
      if n % 2 == 0
    } yield n
    result
  }

  evenGT5(v) is Vector(6, 8);

  def yielding2(v: Vector[Int]): Vector[Int] = {
    for{
      n <- v
      if n < 10
      isOdd = (n % 2 != 0)
      if(isOdd)
    }yield {
      val u = n * 10
      u + 2;
    }
  }
  def yielding2n(v: List[Int]): List[Int] = {
    for{
      n <- v
      if n < 10
      if n % 2 != 0
    }yield{
      val u = n * 10
      u + 2
    }
  }

  val v2 = Vector(1, 2, 3, 4, 5, 6, 7, 8, 10, 13, 14,17);
  yielding2(v2) is Vector(12, 32, 52, 72);

  def yielding4(v: Vector[Int]) = {
    for{
      n <- v
      if n < 10
      isOdd = (n % 2 != 0)
      if(isOdd)
    }yield{
      for(u <- Range(0, n))
        yield u
    }
  }
  yielding4(v2) is Vector(
    Vector(0),
    Vector(0, 1, 2),
    Vector(0, 1, 2, 3, 4),
    Vector(0, 1, 2, 3, 4, 5, 6)
  )

  val l = List(1, 2, 3, 4, 5)
  yielding2n(l) is List(1, 2, 3)
}
