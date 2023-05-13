class P15 {
  def duplicateN[T](number: Int, lst: List[T]): List[T] = lst match
    case Nil => Nil
    case x :: xs =>
      (for (i <- 1 to number) yield x).toList ++ duplicateN(number, xs)
}

object P15 {
  def main(args: Array[String]): Unit = {
    val p15 = new P15()
    println(
      p15.duplicateN(3, List("a", "b", "c", "d", "e"))
    )
  }
}
