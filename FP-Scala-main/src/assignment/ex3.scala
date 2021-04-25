package assignment

object ex3 extends App{
  //option
  val city = Map("karachi" -> "sindh", "lahore" ->"punjab")
  val x = city.get("karachi")
  val y = city.get("quetta")
  println(x)
  println(y)

  //option type in function parameter
  val month = Map("jan" -> "one", "feb" -> "two", "march" -> "three")
  println(display(month.get("feb")))
  println(display(month.get("july")))

  def display(x:Option[String]) = x match{
    case Some(s) => s
    case None => "not found"




    }

}
