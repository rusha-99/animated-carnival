//Write a recursive function primeSeq(n) that prints all prime number which less than n?

object Q2 {
  def gcd(a: Int, b: Int): Int = {
    b match {
      case 0          => a;
      case x if x > a => gcd(x, a);
      case x          => gcd(x, a % x);
    }
  }

  def prime(a: Int, b: Int = 2): Boolean = {
    b match {
      case x if (x == a)      => true;
      case x if gcd(a, x) > 1 => false;
      case x                  => prime(a, x + 1);
    }
  }

  def primeSeq(n: Int): Unit = {
    if (n > 1) {
      primeSeq(n - 1);
      if (prime(n)) //prime(n) = true
        println(n);
    }
   
  }

  def main(args: Array[String]) {
    print("Input a value:");
    var value = readInt(); // read a number from console 
    primeSeq(value);

  }
}