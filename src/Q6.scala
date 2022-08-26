//The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .

object Q6 {
  def fibonacci(n: Int): Int = {
    n match {
      case x if x == 0 => 0;
      case x if x == 1 => 1;
      case x           => fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  def printFibonacciSeq(n: Int): Unit = {
    if (n > 0)
      printFibonacciSeq(n - 1);
    println(fibonacci(n));
  }
  def main(args: Array[String]) {
    printFibonacciSeq(9);
  }
}