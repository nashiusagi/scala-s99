class P22 {
  def range(start: Int, end: Int): List[Int] =
    (start to end).toList
}

object P22 {
  def main(args: Array[String]): Unit = {
    val p22 = new P22
    println(p22.range(4, 9))
  }
}
