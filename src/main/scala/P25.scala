import scala.util.Random

class P25 {
  def randomSelect[T](elements: Int, lst: List[T]): List[T] = {
    val rand = new Random
    (for (i <- 0 until elements) yield lst(rand.nextInt(lst.length))).toList
  }

  def randomPermute[T](lst: List[T]): List[T] = randomSelect(lst.length, lst)
}

object P25 {
  def main(args: Array[String]): Unit = {
    val p25 = new P25
    println(p25.randomPermute(List("a", "b", "c", "d", "e", "f", "g", "h")))
  }
}
