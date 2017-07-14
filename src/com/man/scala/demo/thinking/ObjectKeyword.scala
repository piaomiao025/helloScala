package com.man.scala.demo.thinking
import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/14
  * Time: 17:58
  */
object ObjectKeyword extends App{
  object X {
    val n = 2;
    def f = n * 20;
    def g = this.n * 20;
  }
  X.n is 2;
  X.f is 40;
  X.g is 60;

  class X;
}
