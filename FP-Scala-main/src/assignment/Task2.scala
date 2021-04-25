package assignment

object Task2 {
  //Write a function that returns a List[Char] that contains ’a’-’z’ using tail recursion.
  def CharArray(start:Int): List[Char] =
  {
    def go[T](n:Int, lst:List[Char]): List[Char]= 
    {
      
      if (n > 97+25) 
        return lst
      else
      {
        go(n+1, lst ::: List(n.toChar)) //Use toChar t0o make this work.
      }
    }

    return go(start, List())
  }

  def main(args:Array[String]): Unit = 
  {
    //The only argument which is passed to the method is the start alphabet array in ascii i.e 98. 
    println(CharArray(97))
  }
}
