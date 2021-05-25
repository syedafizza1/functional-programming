package FunctionalProgramming
import scala.collection.mutable.ArrayBuffer
object A_ex2 {
  case class TASK(my_name:String, my_age:Int)

  def main(args:Array[String]): Unit = {
    val object1 = new TASK("FizzaJaffery", 20)
    println("SHALLOW COPY")
    val object2 = object1.copy()
    println(object1.my_name,object2.my_name)
    println(object1.my_age,object2.my_age)


  }

}
