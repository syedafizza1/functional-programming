package FunctionalProgramming

object B_ex2 {
  def task(a: Any, b: Any):String = a.toString + b.toString

  def main(args:Array[String]): Unit = {
    println(task(2,4))
  }

}
