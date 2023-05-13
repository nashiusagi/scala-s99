class P20 {
  def removeAt[T](index: Int, lst: List[T]): (List[T], T) = {
    val a = lst.take(index) ++ lst.drop(index + 1)
    (a, lst.apply(index))
  }
}

object P20 {
  def main(args: Array[String]): Unit = {
    val p20 = new P20
    println(p20.removeAt(1, List("a", "b", "c", "d")))
  }
}
