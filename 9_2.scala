object NumberClassifier {

  val classifyNumber: Int => String = (num: Int) => num match {
    case n if n < 0 => "Input is negative"
    case n if n == 0 => "Input is zero"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }

  def main(args: Array[String]): Unit = {
      print("Please type in an integer: ")
      val inputNumber = scala.io.StdIn.readInt()
      val result = classifyNumber(inputNumber)
      println(result)
    }
  }

