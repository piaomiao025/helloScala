package com.man.scala.demo

/**
  * Created by MXQ on 2017/7/4.
  */
object HelloScala {
  def main(args : Array[String]): Unit ={
    println("Hello, \nScala!");

    var name : String = "Zhangsan";
    name = "lisi";

    val age : Int = 4;

    println(s"姓名：$name, 年龄：${age + 1}");

//    var xb : String;
  }

}
