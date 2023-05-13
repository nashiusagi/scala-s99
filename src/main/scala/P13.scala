class P13 {
  def encodeDirect[T](lst: List[T]): List[(Int, T)] =
    if (lst.isEmpty) Nil
    else {
      val (packed, next) = lst span { _ == lst.head }
      (packed.length, packed.head) :: encodeDirect(next)
    }
}

object P13 {
  def main(args: Array[String]): Unit = {
    val p13 = new P13()
    println(
      p13.encodeDirect[String](
        List(
          "a",
          "a",
          "a",
          "a",
          "b",
          "c",
          "c",
          "a",
          "a",
          "d",
          "e",
          "e",
          "e",
          "e"
        )
      )
    )
  }
}
