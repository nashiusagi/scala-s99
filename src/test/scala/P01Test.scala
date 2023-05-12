import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.diagrams.Diagrams

class P01Test extends AnyFlatSpec with Diagrams {
  val p01 = new P01

  "last method" should "fetch last element" in {
    assert(p01.last(List(1, 1, 2, 3, 5, 8)) === 8)
  }
}
