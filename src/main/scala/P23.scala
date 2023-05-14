import scala.util.Random
class P23 {
  def randomSelect[T](elements: Int, lst: List[T]): List[T] = {
    val rand = new Random
    (for (i <- 0 until elements) yield lst(rand.nextInt(lst.length))).toList
  }
}

object P23 {
  def main(args: Array[String]): Unit = {
    val p23 = new P23
    println(p23.randomSelect(3, List("a", "b", "c", "d", "e", "f", "g", "h")))
  }
}
