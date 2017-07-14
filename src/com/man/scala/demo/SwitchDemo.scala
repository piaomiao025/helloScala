package com.man.scala.demo

/**
  * User: MXQ
  * Date: 2017/7/7
  * Time: 15:25
  */
object SwitchDemo extends App{

  def isTrue(a: Any) = a match {
    case 0 | "" => false;
    case _ => true;
  }

  def listToString(list: List[String]): String = list match{
    case s :: rest => s + " " + listToString(rest);
    case Nil => "";
  }

  def sum(list: List[Int]): Int = list match{
    case Nil => 1;
    case n :: rest => n + sum(rest);
  }

  val fruits = "Apples" :: "Bananas" :: "Oranges" :: Nil;

  println(listToString(fruits));

  val numList = List(1, 2, 3);
  println(sum(numList));
//  println(isTrue("man"))
}
