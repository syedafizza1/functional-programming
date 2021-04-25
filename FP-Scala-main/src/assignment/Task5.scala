package assignment
import scala.collection.mutable.Map
object Task5 {

  def buildMap[A,B](data:Seq[A],
                    f:A=>B): Map[A,B] =
    //where ‘f’ is an user defined function which is passed as parameter
  {
    val mapping = Map[A,B]()
    def done(data:Seq[A],
           f:A=>B, n:Int):Map[A,B]=
    {
      if (n < 0)
        mapping
      else
      {
        mapping ++= Map(data(n) -> f(data(n)))
        println(f(data(n)),data(n))
        done(data, f, n-1)
      }
    }
    return done(data, f, data.size-1)
  }

  val list1 = Array(1,2,3,4,5,6,7,8,9,10)
  def f: Int => Boolean = n => n%2 == 0

  def main(args:Array[String]): Unit = {
    val output = buildMap(list1,f)
    println(output)
  }
}
