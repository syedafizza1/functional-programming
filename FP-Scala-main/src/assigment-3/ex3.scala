package FunctionalProgramming

object ex3 {
  val list1 = List(8,4,2,1,9)

  def euclidean_norm(lst: List[Int]) = math.sqrt(lst.map(math.pow(_,2)).reduce(_+_))

  def main(args:Array[String]): Unit =
  {
    println(s"Euclidean Norm = ${euclidean_norm(list1)}")
  }

}
