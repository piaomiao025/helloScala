package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/14
  * Time: 14:20
  */
object Alias extends App{
  case class LongUnrulyNameFromSomeone();
  type Short = LongUnrulyNameFromSomeone;

  new Short is LongUnrulyNameFromSomeone();

  def assignResult(args: Boolean): Int = {
    val result = if(args) 42 else 47
    result
  }
  def assignResult2(args: Boolean) = {
    if(args) 42 else 47
  }
  def assignResult3(args: Boolean) =
    if(args) 42 else 47

  assignResult3(true) is 42;
  assignResult3(false) is 47;

  class Exclaim(var s: String){
    var count: Int = 0;
    def parens() = {
      count += 1
      s + "!"
    };
    def noParens =
      s + "!"
      count += 1
//    val noParens2 = s + "!"
  }

  val e = new Exclaim("yes");
  e.noParens is "yes!"
//  e.noParens2 is "yes!"
  e.parens() is "yes!"
  e.count is 2;
}
