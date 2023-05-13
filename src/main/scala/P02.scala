class P02 {
  def penultimate(lst: List[Int]): Int = lst match
    case Nil           => 0
    case x :: y :: Nil => x
    case x :: xs       => penultimate(xs)
}

object P02 {
  def main(args: Array[String]): Unit = {
    val p02 = new P02()
    println(p02.penultimate(List(1, 1, 2, 3, 5, 8)))
  }
}
