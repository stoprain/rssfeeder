//> using dep "com.lihaoyi::upickle:3.3.1"
import upickle.default._

object Hello {
  def main(args: Array[String]): Unit =
    println(write(Array(1, 2, 3)))
}

// object Test {
//   @main
//   def main() = println("hello")
// }