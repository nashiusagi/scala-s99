class P14 {
  def duplicate[T](lst: List[T]): List[T] = lst match
    case Nil     => Nil
    case x :: xs => x :: x :: duplicate(xs)
}

object P14 {
  def main(args: Array[String]): Unit = {
    val p14 = new P14()
    println(
      p14.duplicate(List("a", "b", "c", "d", "e"))
    )
  }
}
