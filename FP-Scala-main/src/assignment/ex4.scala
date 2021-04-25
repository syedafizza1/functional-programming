package assignment

object ex4 {
  //high order func in array
  def main(args:Array[String]) {
    println(apply(layout,10))
  }
  def apply(f:Int => String, v:Int) = f(v)
  def layout [A](x:A) = "[" + x.toString() + "]"



}
