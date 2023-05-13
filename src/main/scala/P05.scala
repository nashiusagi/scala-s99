class P05 {
  def reverse(lst: List[Int]): List[Int] = lst.reverse
}

object P05 {
  def main(args: Array[String]): Unit = {
    val p05 = new P05()
    println(p05.reverse(List(1, 1, 2, 3, 5, 8)))
  }
}
