package initbug

object InitBug {
  def main(args: Array[String]): Unit = {
    object Foo {
      val bar = Foo()
    }
    case class Foo()

    Foo.bar
  }
}
