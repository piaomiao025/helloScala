package com.man.scala.demo

/**
  * Created by MXQ on 2017/7/4.
  */
object ForClause {
  def main(args : Array[String]): Unit ={
    var a = 0;
    var b = 0;
//    for( a <- 1 to 3 ; b <- 1 to 3){
////    for( a <- 1 until 10){
//      println(s"value of a: $a, Value of $b");
//    }
    val numList = List(1,2,3,4,5,6);
    var retVal = for{a <- numList ; if a != 3 ; if a < 4}yield a;

    for(a <- retVal){
      println(s"new Value of a: $a");
    }

    println(s" value of add(1, 2) is " + add(1, 2));

  }

  def add(a : Int, b : Int) : Int = {
    return a + b;
  }

}
