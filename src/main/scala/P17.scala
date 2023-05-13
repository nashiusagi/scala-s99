class P17 {
  def split[T](index: Int, lst: List[T]): (List[T], List[T]) =
    lst.splitAt(index)
}

object P17 {
  def main(args: Array[String]) = {
    val p17 = new P17
    println(
      p17.split(3, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))
    )
  }
}
