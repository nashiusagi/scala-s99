class P04 {
  def length(lst: List[Int]): Int = {
    lst.foldLeft(0)((acc, _) => acc + 1)
  }
}

object P04 {
  def main(args: Array[String]): Unit = {
    val p04 = new P04()
    println(p04.length(List(1, 1, 2, 3, 5, 8)))
  }
}
