package com.man.scala.demo.thinking
import com.man.scala.demo.thinking.AtomicTest._;

/**
  * User: MXQ
  * Date: 2017/7/12
  * Time: 17:47
  */
object Coffee extends App{
  class Coffee(val shots: Int = 2, val decaf: Boolean = false, val milk: Boolean = false,
               val toGo: Boolean = false, val syrup: String = ""){
    var results = "";
    println(shots, decaf, milk, toGo, syrup);
    def getCup(): Unit = {
      if(toGo){
        results += "ToGoCup";
      }else{
        results += "HereCup";
      }
    }

    def pourShots(): Unit = {
      for(s <- 0 until shots){
        if(decaf){
          results += " decaf shot ";
        }else{
          results += "shot "
        }
      }
    }

    def addMilk(): Unit = {
      if(milk){
        results += "milk ";
      }
    }

    def addSyrup(): Unit = {
      results += syrup;
    }

    getCup();
    pourShots();
    addMilk();
    addSyrup();
  }

  val usual = new Coffee();
  usual.results is "HereCup shot shot";
  val mocha = new Coffee(decaf = true, toGo = true, syrup = "Chocolate");
  mocha.results is "ToGoCup decaf shot decaf shot Chocolate";
}
