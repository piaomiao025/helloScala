package com.man.scala.demo

import util.control.Breaks._;
/**
  * Created by MXQ on 2017/7/7.
  */
object BreakAndContinueDemo extends App {
  println("\n=== BREAK EXAMPLE ===")

  breakable{
    for(i <- 1 to 10){
      println(i);
      if(i > 4) break;
    }
  }

  println("\n=== CONTINUE EXAPLE ===");

  val searchMe = "peter piper picked a peck of pickled peppers ";
  var numPs = 0;
  for(i <- 0 until searchMe.length){
    breakable{
      if (searchMe.charAt(i) != 'p'){
        break;
      }else{
        numPs += 1;
      }
    }
  }

}
