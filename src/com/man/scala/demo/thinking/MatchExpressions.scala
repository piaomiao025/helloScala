package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/12
  * Time: 15:29
  */
import com.man.scala.demo.thinking.AtomicTest._;
object MatchExpressions extends App{
  def matchColor(color: String): String = {
    color match{
      case "red" => "RED";
      case "blue" => "BLUE";
      case "green" => "GREEN";
      case _ => "UNKNOW COLOR: " + color;
    }
  }
  matchColor("white") is "UNKNOW COLOR: white";
  matchColor("blue") is "BLUE";
}
