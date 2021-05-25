package FunctionalProgramming

object A_ex3 {
  implicit val x = "SIR FARHAN"

  def LST_VARY(implicit vary:String):List[String] = List(vary)

  def main(args:Array[String]): Unit = {
    println(LST_VARY)
  }

}
