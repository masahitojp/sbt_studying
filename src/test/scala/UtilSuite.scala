import org.scalatest.FunSuite

class UtilsSuite extends FunSuite {
  test("""center method retrun string centered""") {
      assert(Utils.center("abc",9)  === "   abc   ")
      assert(Utils.center("abc",10) === "   abc    ")
      assert(Utils.center("abc",2)  === "abc")
  }
}
