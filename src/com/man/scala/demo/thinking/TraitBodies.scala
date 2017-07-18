package com.man.scala.demo.thinking

/**
  * User: MXQ
  * Date: 2017/7/17
  * Time: 17:55
  */
object TraitBodies extends App{
  trait AllAbstract {
    def f(n: Int): Int
    val d: Double
  }

  trait PartialAbstract {
    def f(n: Int): Int
    val d: Double
    def g(s: String) = s"($s)"
    val j = 42;
  }

  trait Concrete {
    def f(n: Int) = n * 11
    val d = 1.61803
  }

  abstract class klass1 extends AllAbstract with PartialAbstract;

  class klass2 extends AllAbstract {
    def f(n: Int): Int = n * 12
    val d = 3.14159
  }

  class klass3 extends AllAbstract with Concrete;

  class klass4 extends PartialAbstract with Concrete;

  println((new PartialAbstract with Concrete).f(2));

  println("#####################")

  trait Base {
    def f = "f"
  }
  trait Derived1 extends Base {
    def g = "17"
  }
  trait Derived2 extends Derived1 {
    def h = "1.11"
  }
  class Derived3 extends Derived2;
  val d = new Derived3;

  d.f
  d.g
  d.h

  trait A {
    def f = 1.1
    def g = "A.g"
    def n = 7
  }
  trait B {
    def f = 7.7
    def g = "B.g"
    def n = 17
  }
  object C extends A with B {
    override def f = 9.9
    override def g = super[A].g + super[B].g
    override def n = 27
  }
  println("################")
  println(C.f)
  println(C.g)
  println(C.n)

  println("#########################")

  
}
