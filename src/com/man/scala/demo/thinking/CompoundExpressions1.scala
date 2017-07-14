package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/11
  * Time: 14:28
  */
object CompoundExpressions1 extends App{
  val hour = 6;
  val isOpen = {
    val opens = 9;
    val closes = 20;
    println(s"Operating hours: $opens - $closes");

    if(hour >= opens && hour <= closes){
      true
    }else{
      false
    }
  }
  println(isOpen);

}
