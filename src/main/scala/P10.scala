class P10 {
  def pack[T](lst: List[T]): List[List[T]] =
    lst.foldRight(Nil: List[List[T]])((el, acc) => {
      if acc.isEmpty then List(el) :: acc
      else if acc.head.head == el then (el :: (acc.head)) :: (acc.drop(1))
      else List(el) :: acc
    })

  def encode[T](lst: List[T]): List[(Int, T)] =
    pack[T](lst)
      .foldLeft(Nil: List[(Int, T)])((acc, el) => (el.length, el.head) :: acc)
      .reverse
}

object P10 {
  def main(args: Array[String]): Unit = {
    val p10 = new P10()
    println(
      p10.encode[String](
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
