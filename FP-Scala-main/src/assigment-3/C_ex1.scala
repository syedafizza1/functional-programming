package FunctionalProgramming

object C_ex1 {
  println(List(1,2,3).map(_*2))
  println(Array(1,2,3).map(_+2))
  println(Vector(1,2,3).map(_*2))
  println(Seq(1,2,3).map(_*2))

  def main(args: Array[String]): Unit = {}

}
