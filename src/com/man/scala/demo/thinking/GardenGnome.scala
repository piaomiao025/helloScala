package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/12
  * Time: 17:58
  */
object GardenGnome extends App{
  class GardenGnome(val height: Double, val weight: Double, val happy: Boolean){
    println("Inside primary constructor");
    var painted = true;
    def magic(level: Int): String = {
      "Poof!" + level;
    }
    def this(height: Double){
      this(height, 100.0, true);
    }
    def this(name: String){
      this(15.0);
      painted is true;
    }
    def show(): String = {
      height + " " + weight + " " + happy + " " + painted;
    }
  }

  new GardenGnome(20.0, 110.0, false).show() is "20.0 110.0 false true";
  new GardenGnome("Bob").show() is "15.0 100.0 true true";
}
