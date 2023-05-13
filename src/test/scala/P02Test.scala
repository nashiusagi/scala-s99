import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.diagrams.Diagrams

class P02Test extends AnyFlatSpec with Diagrams {
  val p02 = new P02

  "penultimate method" should "fetch last but one element" in {
    assert(p02.penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }
}
