class P08 {
  def compress[T](lst: List[T]): List[T] =
    lst.foldRight(Nil: List[T])((el, acc) => {
      if acc.isEmpty || acc.head != el then el :: acc
      else acc
    })
}

object P08 {
  def main(args: Array[String]): Unit = {
    val p08 = new P08()
    println(
      p08.compress[String](
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
