object App {
  def greeting(msg: String): Unit = println(msg)

  def main(args: Array[String]): Unit = {
    greeting(sample.Sample.test() + "bong")
  }
}
