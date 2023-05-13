class P03 {
  def nth(index: Int, lst: List[Int]): Int = lst match
    case Nil => -1
    case x :: xs =>
      if index == 0 then x
      else nth(index - 1, xs)
}

object P03 {
  def main(args: Array[String]): Unit = {
    val p03 = new P03()
    println(p03.nth(2, List(1, 1, 2, 3, 5, 8)))
  }
}
