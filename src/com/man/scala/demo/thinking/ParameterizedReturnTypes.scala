package com.man.scala.demo.thinking
import com.man.scala.demo.thinking.AtomicTest._;

/**
  * User: MXQ
  * Date: 2017/7/13
  * Time: 14:39
  */
object ParameterizedReturnTypes extends App{
  def inferred(c1: Char, c2: Char, c3: Char) ={
    Vector(c1, c2, c3)
  }

  def explicit(c1: Char, c2: Char, c3: Char): Vector[Char] = {
      Vector(c1, c2, c3);
  }

  inferred('a', 'b', 'c') is "Vector(a, b, c)";
  explicit('a', 'b', 'c') is "Vector(a, b, c)";

  def show(n: Int): Unit = {
    println("> " + n);
  }
  val v1 = Vector(1, 2, 3, 4);
  v1.foreach(show(_));

  val v2 = Vector(19, 1, 7, 3, 2, 14);
  v2.sorted is Vector(1, 2, 3, 7, 14, 19);
  v2.sortWith((x, y) => x > y) is Vector(1, 2, 3, 7, 14, 19);

  class Later(val f: () => Unit){
    def call(): Unit = {
      f();
    }
  }

  val c1 = new Later(() => println("now"));
  c1.call();

  val dogYears = (n: Int) => n * 7;

  dogYears(10) is 70;

  var s = "";
  val v3 = Vector(1, 5, 7, 8);
//  v3.foreach(n => s = s + dogYears(n) + " ");
  v3.foreach(n => s = s + n * 7 + " ");
  s is "7 35 49 56 ";

  def between = (temp: Int, low: Int, high: Int) => {
    if(temp >= low && temp <= high){
      true;
    }else{
      false;
    }
  }

  between(70, 80, 90) is false;
  between(70, 60, 90) is true;

  s = "";
  val numbers = Vector(1, 2, 5, 7, 9);
  numbers.foreach(n => s = s + n*n + " ");
  s is "1 4 25 9 49 "

  val pluralize = (n: String) => n + "s";
  pluralize("cat") is "dogs";
  pluralize("dog") is "dogs";
  pluralize("silly") is "sillys";
}
