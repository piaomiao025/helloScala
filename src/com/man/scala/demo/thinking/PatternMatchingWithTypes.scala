package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._

import scala.collection.immutable.Range;

/**
  * User: MXQ
  * Date: 2017/7/14
  * Time: 9:33
  */
object PatternMatchingWithTypes extends App{
  def acceptAnything(x: Any): String = {
    x match{
      case s: String => s"A String: $s"
      case i: Int if(i < 20) => s"Ant Int less than 20: $i"
      case i: Int => s"Some other Int: $i"
      case p: Person => s"A person ${p.name}"
      case _ => "I do not know what that is !"
    }
  }

  case class Person(name: String);

  acceptAnything(5) is "An Int less than 20: 5"
  acceptAnything(25) is "Some other Int: 25"
  acceptAnything("Some Text") is "A String: Some Text"
  val bob = Person("Bob");
  acceptAnything(bob) is "A person Bob";
  acceptAnything(Vector(1, 2)) is "I do not know what that is !"

  def plugs1(x: Any): Any = {
    x match{
      case i: Int => i + 1
      case s: String => s + "s"
      case p: Person => p + " +guest"
      case _ => "Nothing matched"
    }
  }

  plugs1("car") is "cars";
  plugs1(67) is 68;
  plugs1(Person("Joanna")) is "Person(Joanna) +guest"

  def convertToSize(x: Any): Int = {
    x match{
      case i: Int => i
      case s: String => s.size
      case p: Person => 1
      case d: Double => scala.math.round(d).asInstanceOf[Int]
      case _ => 0
    }
  }

  convertToSize(45) is 45;
  convertToSize("car") is 3;
  convertToSize("trunk") is 5;
  convertToSize(Person("Jonna")) is 1;
  convertToSize(45.6D) is 45.6D;
  convertToSize(Vector(1, 2)) is 0;


  def quantify(x: Any): String = {
    x match{
      case i: Int if i < 100 => "small"
      case i: Int if i >= 100 && i <= 1000 => "medium"
      case i: Int if i > 1000 => "large"
      case d: Double if d < 100 => "small"
      case d: Double if d >= 100 && d <= 1000 => "medium"
      case d: Double if d > 1000 => "large"
      case _ => "None"
    }
  }

  quantify(100) is "medium";
  quantify(20.5) is "small";
  quantify(100000) is "large";
  quantify(-15999) is "small";

  def forecast(i: Int): String = {
    i match{
      case i: Int if inRange(Range(81, 101), i) => "Sunny"
      case i: Int if inRange(Range(51, 81), i) => "Mostly Sunny"
      case i: Int if inRange(Range(21, 51), i) => "Partly Sunny"
      case i: Int if inRange(Range(1, 21), i) => "Mostly Cloudy"
      case i: Int if inRange(Range(0, 1), i) => "Cloudy"
      case _ => "Unknown"
    }
  }

  def inRange(r: Range, a: Int): Boolean = {
    for(i <- r){
      if(i == a){
        return true;
      }
    }
    false;
  }

  forecast(100) is "Sunny";
  forecast(81) is "Sunny";
  forecast(80) is "Mostly Sunny";
  forecast(51) is "Mostly Sunny";
  forecast(50) is "Partly Sunny";
  forecast(21) is "Partly Sunny";
  forecast(20) is "Mostly Cloudy";
  forecast(1) is "Mostly Cloudy";
  forecast(0) is "Cloudy";
  forecast(-1) is "Unknown";
}
