class P07 {
  def flatten(lst: List[Any]): List[Any] = lst flatMap {
    case ls: List[_] => flatten(ls)
    case e           => List(e)
  }
}

object P07 {
  def main(args: Array[String]): Unit = {
    val p07 = new P07()
    println(p07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
