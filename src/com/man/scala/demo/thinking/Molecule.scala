package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._;

/**
  * User: MXQ
  * Date: 2017/7/14
  * Time: 16:34
  */
object Molecule extends App{
  class Molecule {
    var attached: Molecule = _;
    def plus(other: Molecule) = attached = other
    def +(other: Molecule) = attached = other
  }

  var m1 = new Molecule
  var m2 = new Molecule
  m1 + m2;

  class FancyNumber1(a: Int){
    def power(n: Int) = scala.math.pow(a, n).toInt;
    def ^(n: Int) = power(n);
  }
  val a1 = new FancyNumber1(2);
  a1.power(3) is 8;

  a1 ^ 3 is 8;
}
