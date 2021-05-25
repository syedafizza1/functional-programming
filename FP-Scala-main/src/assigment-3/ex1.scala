package FunctionalProgramming

object ex1 {
  val a = 3
  val b = 5
  val c = 7

  def quadratic(from:Int,to:Int):List[Int] = {
    def formula(n:Int,n1:Int, result:List[Int]):List[Int] = {
      if (n == n1+1 ){
        result
      }else{
        formula(n+1,n1, result :+ n)
      }
    }
    return formula(from,to,List())
  }

  val list1 = quadratic(-3,3)

  def done(x:Int) = a*(x*x) + b*x + c

  def main(args:Array[String]): Unit = {
    val finalres = list1.map(done _)
    println(finalres)
  }

}
