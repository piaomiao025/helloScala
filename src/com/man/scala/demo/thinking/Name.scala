package com.man.scala.demo.thinking
import reflect.runtime.currentMirror
import com.man.scala.demo.thinking.AtomicTest._
/**
  * User: MXQ
  * Date: 2017/7/18
  * Time: 10:44
  */
object NameDemo extends App{
  object Name {
    def className(x: Any): String = {
      currentMirror.reflect(x).symbol.toString.split(' ').last;
    }
  }
  trait Name {
    override def toString = Name.className(this)
  }
  class Solid extends Name
  val s = new Solid
  println(s)

  class Solid2(val size: Int) extends Name {
    override def toString = s"${super.toString}($size)"
  }
  val s2 = new Solid2(27)
  s2 is "Solid2(27)"

  println("######################")
  case class CaseClass(s: String) extends Name
  println(CaseClass.toString());

}
