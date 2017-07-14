package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._;

/**
  * User: MXQ
  * Date: 2017/7/13
  * Time: 18:00
  */
object Activity extends App{
  case class Activity(dateStr: String, action: String);

  def getDates(action: String, activities: Vector[Activity]): Vector[String] ={
    for{
      n <- activities
      if n.action == action
    } yield n.dateStr
  }

  def getActivities(dateStr: String, activities: Vector[Activity]) : Vector[String] = {
    for{
      n <- activities
      if(n.dateStr == dateStr)
    } yield n.action
  }

  val activities = Vector(
    Activity("01-01", "Run"),
    Activity("01-03", "Ski"),
    Activity("01-04", "Run"),
    Activity("01-10", "Ski"),
    Activity("01-03", "Run")
  )
  getDates("Ski", activities) is Vector("01-03", "01-10");
  getDates("Byke", activities) is Vector();

  getActivities("01-01", activities) is Vector("Run");
  getActivities("01-02", activities) is Vector();
  getActivities("01-03", activities) is Vector("Ski", "Run");
}
