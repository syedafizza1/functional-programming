package FunctionalProgramming
import ex1._

object ex2 {
  val list1 = quadratic(-3,3)

  val list2 = list1.map(done _)

  val list3 = list1.zip(list2).zipWithIndex map {case ((a, b), c) => List(a, b, c)}

  val res1 = list3.map(_(1)).reduce(_+_)

  val res2 = list3.map(_(2)).reduce(_ max _)+1

  val mean = res1/res2

  def main(args:Array[String]): Unit =
  {
    println(list3)
    println(s"mean = ${mean}")
  }


}
