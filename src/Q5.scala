//Write a recursive function to get the addition of all even numbers less than given n.

object Q5 {

  var b: Int = 0;

  def sum(a: Int): Unit = {
    if (a > 0) {
      if (a % 2 == 0) {
        b = b + a;
      }
      sum(a - 1);
    } else {
      print(b);
    }
  }

  def main(args: Array[String]) {
    print("Input a value:");
    var value = readInt();
    sum(value -1); // Select the range less than the number entered
  }
}