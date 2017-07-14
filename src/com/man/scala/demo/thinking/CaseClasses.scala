package com.man.scala.demo.thinking

import com.man.scala.demo.thinking.AtomicTest._;

/**
  * User: MXQ
  * Date: 2017/7/13
  * Time: 11:02
  */
object CaseClasses extends App{
  case class Dog(var name: String);
  val dog1 = Dog("Henry");
  val dog2 = Dog("Cleo")
  dog1.name = "hello";
  val dogs = Vector(dog1, dog2);
  dogs is Vector(Dog("Henry"), Dog("Cleo"));
  println(dog1.name);

  case class Cat(name: String = "Hi", sex: Int = 1);
  val cat1 = Cat(sex = 2);
  println(cat1);
}
