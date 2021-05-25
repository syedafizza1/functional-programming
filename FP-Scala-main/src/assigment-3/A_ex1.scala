package FunctionalProgramming
import scala.util.control.Breaks._

//FSM TASK

class A_ex1 {
  val initial = 1
  val max = 10
  var state = A_ex1.one.toString
  var count = initial
  while (true){
    state match {
      case "idle" => {
        print(s"${count}\n")
        count = count + 1
        println(count)
        state = A_ex1.two.toString
      }
      case "going_up" => {
        if (count == max){
          count = initial
          state = A_ex1.three.toString
        }
        else{
          count = count + 1
          println(count)
        }
      }
      case "exit" => break//println("FSM Exit")
    }
  }
}

object A_ex1 extends Enumeration {

  val one = Value("idle")
  val two = Value("going_up")
  val three = Value("exit")

  def main(args:Array[String]): Unit = {
    val obj = new A_ex1()
  }

}
