package com.man.scala.demo

/**
  * Created by MXQ on 2017/7/5.
  */
object StringDemo {
  val MOD_ADLER = 65521;

  def main(args : Array[String]) : Unit = {
    val sum = adler32Sum("Wikipedia");
    printf("checksum (int) = %d\n", sum);
    printf("checksum (hex) = %s\n", sum.toHexString)

    println("1".increment);
  }

  def adler32Sum(s: String) : Int = {
    var a = 1;
    var b = 0;
    s.getBytes.foreach{char =>
      a = (char + a) % MOD_ADLER
      b = (b + a) %MOD_ADLER
    }
    b * 65536 + a
  }

  implicit class StringImprovements(val s: String){
    def increment = s.map(c => (c + 1).toChar);
    def decrement = s.map(c => (c - 1).toChar);
    def hideAll: String = s.replaceAll(".", "*");
    def plusOne = s.toInt + 1;
    def asBoolean = s match {
      case "0" | "zero" | "" | " " => false;
      case _=> true;
    }
  }

}
