class P01 {
  def last(lst: List[Int]): Int = lst match
    case Nil      => 0
    case x :: Nil => x
    case x :: xs  => last(xs)

}

object P01 {
  def main(args: Array[String]): Unit = {
    val p01 = new P01()
    println(p01.last(List(1, 1, 2, 3, 5, 8)))
  }
}
