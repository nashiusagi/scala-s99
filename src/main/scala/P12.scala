class P12 {
  def decode[T](lst: List[(Int, T)]): List[T] = lst match
    case Nil          => Nil
    case (x, y) :: xs => (for (i <- 1 to x) yield y).toList ++ decode[T](xs)
}

object P12 {
  def main(args: Array[String]): Unit = {
    val p12 = new P12()
    println(
      p12.decode(
        List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))
      )
    )
  }
}
