package assignment
import scala.util.Random.nextInt

object Task1 {
  //Generate a list of 15 integer numbers generated randomly from 50 - 500. 
  val list1 = List.fill(15)(util.Random.between(50,500))
  
  //After making the complete list check if each element is prime or not, 

  val Prime:Int => Boolean = n => 
    n <= 1 || n == 2 || !(2 to (n-1)).exists(n % _ == 0)
  
  //if its a prime number then put it into an iterator. Finally sort them in ascending order 
  val iterator1= list1.filter(Prime).sortWith(_ < _).iterator

//and put them into a Map

  val map1 = scala.collection.mutable.Map[Int,Int]()
  
  //Where each key should be the element location of the number. 
  def main(args:Array[String]): Unit = {
    println("The values of Iterator are:")
    var count = 0
    while (iterator1.hasNext){
      val item = iterator1.next()
      map1 += (item -> count)
      println(item)
      count += 1
    }
    println("Format Mapping:")
    println(map1)
  }
}
