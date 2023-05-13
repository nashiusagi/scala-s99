class P19 {
  def rotate[T](index: Int, lst: List[T]): List[T] = {
    val (a, b) = lst.splitAt(index)
    b ++ a
  }
}

object P19 {
  def main(args: Array[String]): Unit = {
    val p19 = new P19
    println(
      p19.rotate(3, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))
    )
  }
}
