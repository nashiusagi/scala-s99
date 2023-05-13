class P09 {
  def pack[T](lst: List[T]): List[List[T]] =
    lst.foldRight(Nil: List[List[T]])((el, acc) => {
      if acc.isEmpty then List(el) :: acc
      else if acc.head.head == el then (el :: (acc.head))::(acc.drop(1))
      else List(el) :: acc
  })
}

object P09 {
  def main(args: Array[String]): Unit = {
    val p09 = new P09()
    println(
      p09.pack[String](
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
