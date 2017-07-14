package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/12
  * Time: 17:32
  */
object VariableClassArgs extends App{
  import com.man.scala.demo.thinking.AtomicTest._;

  class Sum(args: Int*){
    def result(): Int = {
      var total = 0;
      for(n <- args){
        total += n;
      }
      total;
    }
  }

  new Sum(12, 27, 44).result() is 84;
  new Sum(1, 3, 5, 7, 9, 11).result() is 36;
}
