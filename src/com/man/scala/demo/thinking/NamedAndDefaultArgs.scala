package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/12
  * Time: 17:36
  */
object NamedAndDefaultArgs extends App{
  class Color(red: Int, blue: Int, green: Int);

  new Color(red = 80, blue = 9, green = 100);
  new Color(80, 9, green = 100);

  class Color2(red: Int = 100, blue: Int = 100, green: Int = 100);
  new Color2(green = 10);
  new Color2(10, 20);
}
