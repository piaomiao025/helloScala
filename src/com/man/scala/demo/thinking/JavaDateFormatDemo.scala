package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._
import java.text.SimpleDateFormat
import java.util.Date

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

/**
  * User: MXQ
  * Date: 2017/7/18
  * Time: 10:00
  */
object JavaDateFormatDemo extends App{
  val datePattern = new SimpleDateFormat("MM/dd/yy");
  val myDay = datePattern.parse("05/01/12");
  myDay.getDay is 1
  myDay.getMonth is 4

  val today = datePattern.format(new Date);
  println(today);

  println("#####################################")
  import org.apache.commons.math3.stat.Frequency;
  val f = new Frequency
  f.addValue("cat")
  f.addValue("dog")
  f.addValue("cat")
  f.addValue("bird")
  f.addValue("cat")
  f.addValue("cat")
  f.addValue("kitten")
  f.addValue("mouse")
  f.getCount("cat") is 4

  println("###################")

  val s = new SummaryStatistics
  s.addValue(10)
  s.addValue(20)
  s.addValue(30)
  s.addValue(80)
  s.addValue(90)
  s.addValue(100)

  s.getMean is 55;
  s.getStandardDeviation is 39
}
