class P16 {
  def drop[T](index: Int, lst: List[T]): List[T] =
    lst.take(index - 1) ++ lst.drop(index)
}

object P16 {
  def main(args: Array[String]): Unit = {
    val p16 = new P16
    println(
      p16.drop(3, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))
    )
  }
}
