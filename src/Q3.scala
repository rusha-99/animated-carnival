//Write a recursive function returns the addition of numbers from1 to n?

object Q3 {
  def addNumbers(n: Int): Int = {
    n match {
      case x if x != 0 => n + addNumbers(n - 1);
      case _           => n;
    }
  }

  def main(args: Array[String]) {
    print("Input a value:");
    var value = readInt();
    println(addNumbers(value));
  }
}