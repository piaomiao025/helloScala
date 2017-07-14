package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/14
  * Time: 16:45
  */
object Bicycle extends App{
  case class Bicycle(riders: Int);
  println(Bicycle(2))

  class Surry(val adornment: String){
    override def toString() = s"Surry with the $adornment"
  }
  println(new Surry("abc"));

  case class Cycle(n: Int){
    override def toString = {
      n match{
        case 1 => "Unicycle"
        case 2 => "Bicycle"
        case 3 => "Tricycle"
        case 4 => "Quandricycle"
        case n if n > 4 => s"Cycle with $n wheels"
        case _ => "That's not a cycle!"
      }
    }
  }

  println(Cycle(1));
  println(Cycle(2));
  println(Cycle(3));
  println(Cycle(4));
  println(Cycle(5));
  println(Cycle(-1));
}
