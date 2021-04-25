package assignment
object task1 extends App {
  //Generate a list of 15 integer numbers generated randomly from 50 - 500.
  // After making the complete list check if each element is prime or not,
  // if its a prime number then put it into an iterator.
  // Finally sort them in ascending order and put them into a Map.
  // Where each key should be the element location of the number.
  // Bonus point for anyone who does not uses for loop

  val num = List.range(50,500,30)
  println(num)
  print(num.length)

  def Prime(i :Int) : Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i-1)).exists(x => i % x == 0)
  }
  num.foreach(i => if (Prime(i))
    println("%d is prime.".format(i)))
  //println (num.filter(isPrime))
  //println(isPrime(3))





}
