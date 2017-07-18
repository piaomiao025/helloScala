package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/17
  * Time: 17:22
  */
object AbstractClasses extends App{
  abstract class Animal{
    def templateMethod = s"The $animal goes $sound "

    def animal: String
    var sound: String
  }

  class Duck extends Animal {
     def animal = "Duck"
     var sound = "Quack"
    def animal(n: Int) = 2;
  }

  class Cow extends Animal {
    var animal = "Cow"
    var sound = "Moo"
  }

  println((new Duck).templateMethod)
  println((new Cow).templateMethod)
  println((new Duck).animal(2))

  abstract class Adder(x: Int) {
    def add(y: Int): Int
  }

  case class NumericAdder(val x: Int) extends Adder(x) {
    def add(y: Int): Int = x + y
  }

  val num = new NumericAdder(5);
  println(num.add(10))
}
