// different ways to make an array
package assignment

object ex1 extends App{
    // 1. basic way, declare datatype implicitly
    val z:Array[String] = new Array[String](3)
    z(0) = "fizza";
    z(1) = "talha";
    z(2) = "shahzaib"
    println (z(0))

    // 2. another way - assign manually
    val b = Array(1,2L,3D,4,5)
    b.foreach(println)
    //println (b.mkString)

    // 3. use var as reference and assign VALUES later
    var learning_journey: Array[String]= _ //values not yet assigned so it is null

    //later
    learning_journey = Array ("scala", "chisel", "functional programming")
    //println(learning_journey.mkString)
    learning_journey.foreach(println)

    // 4. create array by giving range instead of populating it manually
    val num = Array.range(1,13)
    println(num.toSeq)
}
