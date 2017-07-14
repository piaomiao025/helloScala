package com.man.scala.demo

import scala.annotation.tailrec

/**
  * User: MXQ
  * Date: 2017/7/10
  * Time: 18:00
  */
object Whilst {
  @tailrec
  def whilst(testCondition: => Boolean)(codeBlock: => Unit): Unit ={
    if(testCondition){
      codeBlock
      whilst(testCondition){
        codeBlock;
      }
    }
  }

}
