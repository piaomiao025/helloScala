package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/12
  * Time: 14:45
  */
class Temperature {
  var current = 0.0;
  var scale = "f";

  def setFahrenheit(now: Double): Unit = {
    current = now;
    scale = "f";
  }
  def setCelsius(now: Double): Unit = {
    current = now;
    scale = "c";
  }

  def getFahrenheit(): Double = {
    if(scale == "f"){
      current;
    }else{
      current * 5.9/5.0 + 32.0;
    }
  }

  def getCeisius(): Double = {
    if(scale == "c"){
      current;
    }else{
      (current - 32) * 5.0/9.0
    }
  }
}

object TemperatureTest extends App{
  import com.man.scala.demo.thinking.AtomicTest._;
  val temp = new Temperature;
  temp.setFahrenheit(98.6);
  temp.getFahrenheit() is 98.6;
  temp.getCeisius() is 37.0
  temp.setCelsius(100.0);
  temp.getFahrenheit() is 212.0
}
