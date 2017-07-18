package com.man.scala.demo.thinking
import java.awt.geom.Ellipse2D

import com.man.scala.demo.thinking.NameDemo.Name
/**
  * User: MXQ
  * Date: 2017/7/18
  * Time: 11:20
  */
object Polymorphism extends App{
  class Element extends Name {
    def interact(other: Element) = s"$this interact $other"
    def draw = "Drawing the Element"
  }
  class Inert extends Element {
    override def draw = "Inert drawing!"
  }
  class Wall extends Inert

  trait Material {
    def resilience: String
  }
  trait Wood extends Material {
    def resilience = "Breakable"
  }
  trait Rock extends Material {
    def resilience = "Hard"
  }
  class RockWall extends Wall with Rock
  class WoodWall extends Wall with Wood

  trait Skill
  trait Fighting extends Skill {
    def fight = "Fight!"
  }
  trait Digging extends Skill {
    def dig = "Dig!"
  }
  trait Magic extends Skill {
    def castSpell = "Spell!"
  }
  trait Flight extends Skill {
    def fly = "Fly!"
  }

//  class Character(var player: String = "None") extends Element
  class Character(var player: String = "None") extends Element
  class Fairy extends Character with Magic
  class Viking extends Character with Fighting
  class Dwarf extends Character with Digging with Fighting
  class Wizard extends Character with Magic
  class Dragon extends Character with Magic with Flight

  val d = new Dragon()
  d.player = "Puff"
  println(d.interact(new Wall))

  def battle(fighter: Fighting) = s"$fighter, ${fighter.fight}"
  println(battle(new Viking))
  println(battle(new Dwarf))
  println(battle(new Fairy with Fighting))

  def fly(flyer: Element with Flight, opponent: Element) = s"$flyer, ${flyer.fly}, ${opponent.interact(flyer)}"
  println(fly(d, new Fairy))

  println("######################")

  trait Mobile{
    def move: String
  }
  class Animal extends Mobile{
    def move = "Animal moving!"
  }
  class Car extends Mobile {
    def move = "Car moving!"
  }

  def moving(mo: Mobile) = println(mo.move)

  moving(new Animal)
  moving(new Car)

  println("##########################")
  val e = new Element
  println(e.draw)
  val in = new Inert
  println(in.draw)
  val wall = new Wall
  println(wall.draw)

  trait Seed
  class Tomato extends Seed with Name{
    override def toString = s"${Name.className(this)}"
  }
  class Corn extends Seed with Name{
    override def toString = s"${Name.className(this)}"
  }
  class Zucchini extends Seed with Name{
    override def toString = s"${Name.className(this)}"
  }

  println("#############")
  class Garden(seeds: Seed*){
//    var v = Vector[Seed]
//    v = {
//      for{s <- seeds} yield s
//    }
    val v = seeds.toVector
    override def toString = v.mkString(", ");
  }

  val garden = new Garden(new Tomato, new Corn, new Zucchini)
  println(garden)

  val v2 = Vector("D", "U", "C", "K")
  println(v2.reduce((sum, n) => sum + " " + n))

  println("#########################################")

  trait Shape{
    def draw = Name.className(this)
  }
  class Ellipse extends Shape with Name
  class Rectangle extends Shape with Name
  class Circle extends Ellipse
  class Square extends Rectangle

  class Drawing(shapes: Shape*) {
    val v = shapes.toVector
    def draw = v.map(n => n.draw)
    override def toString = v.mkString(", ")
  }

  val drawing = new Drawing(new Rectangle, new Square, new Ellipse, new Circle)
  println(drawing.draw)
  println(drawing)
}
