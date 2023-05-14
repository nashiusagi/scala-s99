class P21 {
  def insertAt[T](newEl: T, index: Int, lst: List[T]): List[T] = {
    val (front, back) = lst.splitAt(index)
    front ++ List(newEl) ++ back
  }
}

object P21 {
  def main(args: Array[String]): Unit = {
    val p21 = new P21
    println(p21.insertAt("new", 1, List("a", "b", "c", "d")))
  }
}
