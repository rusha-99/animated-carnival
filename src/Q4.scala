//Write a recursive function to determine even and odd numbers

object Q4 {
  def isEven(n: Int): Any = {
    n match {
      case x if x == 0 => "Number you entered is an even number.";
      case x if x == 1 => "Number you entered is an odd number.";
      case x if x < 0  => isEven(-n); //If the number entered is a negative number
      case _           => isEven(n - 2);
    }
  }

  def main(args: Array[String]) {
    print("Input a value:");
    var value = readInt();
    println(isEven(value));

  }
}