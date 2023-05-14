import scala.util.Random

class P24 {
  def lotto(count: Int, max: Int): List[Int] = {
    Random.shuffle(1 to max).take(count).toList
  }
}

object P24 {
  def main(args: Array[String]): Unit = {
    val p24 = new P24
    println(p24.lotto(6, 49))
  }
}
