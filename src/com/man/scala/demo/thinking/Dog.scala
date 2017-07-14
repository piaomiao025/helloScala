package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/11
  * Time: 15:19
  */
object Animal extends App{
  class Dog {
    def bark() : String = {"yip!"};
  }

  class Cat {
    def meow(): String = {"mew!"};
  }

  val cat = new Cat;
  val ml = cat.meow();
//  assert("mew!" == ml, s"expected mew!, Got $ml")

  class Sailboat{
    def sailsRaised(): String = {
      "Sails raised"
    }
    def sailsLowered(): String = {
      "Sails lowered"
    }
  }

  class Motorboat{
    def on(): String = {
      "Motor on"
    }
    def off(): String = {
      "Motor off"
    }
  }

  val r1 = new Sailboat;
  assert(r1 == "Sails raised", s"Excpected sails raised, Got $r1");
}