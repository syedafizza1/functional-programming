package assignment

object Task3 {
//Given two Array[Double] values of the same length
  def ArraySum(array1:Array[Double], 
               array2:Array[Double], 
               array3:Array[Double]):Array[Double] = 
  {
    //write a function that returns the element-wise sum.
    def done(n:Int, 
             array1:Array[Double], 
             array2:Array[Double], 
             array3:Array[Double]): Array[Double]=
    {
      if (n < 0) 
        array3
      else
      {
        array3(n) = array1(n)+array2(n)
        done(n-1, array1, array2, array3)
      }
    }
    return 
    done(array1.size-1, array1,array2,array3)
  }

  def main(args:Array[String]): Unit = {
    val array1 = Array(1.0,2.0,3.0)
    val array2 = Array(4.0,5.0,6.0)

    val array3 = new Array[Double](array1.size)
    for (i <- ArraySum(arr1,arr2,arr3)) {
      println(i)
    }
  }
}
