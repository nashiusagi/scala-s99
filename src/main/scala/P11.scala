class P11 {
  def pack[T](lst: List[T]): List[List[T]] =
    lst.foldRight(Nil: List[List[T]])((el, acc) => {
      if acc.isEmpty then List(el) :: acc
      else if acc.head.head == el then (el :: (acc.head)) :: (acc.drop(1))
      else List(el) :: acc
    })

  def encodeModifined[T](lst: List[T]): List[Any] =
    pack[T](lst)
      .foldLeft(Nil: List[Any])((acc, el) => {
        if el.length != 1 then (el.length, el.head) :: acc
        else el.head :: acc
      })
      .reverse
}

object P11 {
  def main(args: Array[String]): Unit = {
    val p11 = new P11()
    println(
      p11.encodeModifined[String](
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
