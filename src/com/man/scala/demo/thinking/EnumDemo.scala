package com.man.scala.demo.thinking
import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/17
  * Time: 17:02
  */
object EnumDemo extends App{
  object MonthName extends Enumeration {
    type MonthName = Value
    val January = Value(1)
    val February = Value(2)
    val March = Value(3)
    val April = Value(4)
    val May = Value(5)
    val June = Value(6)
    val July = Value(7)
    val August = Value(8)
    val September = Value(9)
    val October = Value(10)
    val November = Value(11)
    val December = Value(12)
  }

  MonthName.February is "February"
  MonthName.February.id is 2;
  MonthName.December.id is 12;
  MonthName.July.id is 7;

  import MonthName._
  July is "July"

  def monthNumber(name: MonthName) = name.id

  monthNumber(July) is 7

  println("#################")

  def season(name: MonthName) = name match{
    case x if x == December || x == January || x == February => "Winter"
    case x if x == March || x == April || x == May => "Spring"
    case x if x == June || x == July || x == August => "Summer"
    case x if x == September || x == October || x == November => "Autumn"
    case _ => "Wrong month !"
  }

  season(January) is "Winter"
  season(April) is "Spring"
  season(August) is "Summer"
  season(November) is "Autumn"
}
