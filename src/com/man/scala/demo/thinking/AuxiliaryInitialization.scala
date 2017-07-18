package com.man.scala.demo.thinking
import com.man.scala.demo.thinking.AtomicTest._;
/**
  * User: MXQ
  * Date: 2017/7/17
  * Time: 15:06
  */
object AuxiliaryInitialization extends App{
  case class House(val address: String, val state: String, val zip: String){
    def this(state: String, zip: String){
      this("address?", state, zip)
    }
    def this(zip: String){
      this("address?", "state?", zip)
    }
  }

  class Home(address: String, state: String, zip: String, val name: String)
    extends House(address, state, zip){
    override def toString = s"$name: $address, $state $zip";
  }

  class VacationHouse(state: String, zip: String, val startMonth: Int, val endMonth: Int)
    extends House(state, zip);

  class TreeHouse(val name: String, zip: String) extends House(zip);

  val h = new Home("888 N, Main St.", "KS", "66632", "Metropolis");
  h.address is "888 N. Main St.";
  h.state is "KS";
  h.name is "Metropolis";

  h is "abc";

  val v = new VacationHouse("KS", "66632", 6, 8);
  v.state is "KS";
  v.startMonth is 6;
  v.endMonth is 8;

  val tree = new TreeHouse("0ak", "48104");
  tree.name is "0ak";
  tree.zip is "48104";
}
