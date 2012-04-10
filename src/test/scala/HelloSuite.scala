import org.scalatest.FunSuite

class HelloSuite extends FunSuite {
  test("""traditional "hello world" from K&R""") {
      assert(Hello.greeting === "hello, world")
  }
}
