package assignment
import scala.collection.mutable.Set
import scala.collection.mutable.Map

object ex2 extends App {
  //set (immutable - by default)
  val s = Set(7, 3, 2, 8)
  println(s)

  //making it mutable, by importing  scala.collection.mutable.Set

  val s1 = Set("scala", "chisel")
  println(s1)
  s1 += "python"
  s1 += "html"
  println(s1)

  //mutable map
  var sem: Map[String, Int] = Map()

  sem += ("PROGRAMMING FUNDAMENTALS" -> 1)
  sem += ("OBJECT ORIENTED" -> 2)
  sem += ("DATA STRUCTURES" -> 3)
  println(sem)

}

