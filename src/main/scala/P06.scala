class P06 {
  def isPalindrome(lst: List[Int]): Boolean = lst == lst.reverse
}

object P06 {
  def main(args: Array[String]): Unit = {
    val p06 = new P06()
    println(p06.isPalindrome(List(1, 2, 3, 2, 1)))
  }
}
