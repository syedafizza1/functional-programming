package assignment

object Task4 {
  //code different techniques that will take an Array[Int] and return number of even values in the Array. 
  
  val array1 = Array.fill(100)(util.Random.nextInt(100) )
//Each one will use a different technique. To test this on a larger array you can make one using Array 
  def countRecursive(arr:Array[Int]):Int=
  {
    //1. Use a recursive function.
    def display(arr:Array[Int], 
           n:Int, 
           res:Int):Int=
    {
      if (n >= arr.size) 
        res
      else
      {
        if (arr(n)%2 == 0) 
          display(arr,n+1,res+1)
        else 
          display(arr,n+1,res)
      }
    }
    display(arr,0,0)
  }
  //2. Use the count higher-order method.

  def main(args:Array[String]): Unit = 
  {
    array1.foreach(println)
    println("1-- By using recursive function:",countRecursive(array1))
    println("2-- By using count method:",array1.count(_%2 == 0))
  }
}
