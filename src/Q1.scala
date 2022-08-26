//Write a recursive function prime(n) that returns true for a prime number and false for the other? 

object Q1 {
  def GCD(a: Int, b: Int): Int = {
    b match {
      case x if x == 0 => a; //b == 0
      case x if x > a  => GCD(x, a); //(b,a)
      case x           => GCD(x, a % x); //(b,a%b)

    }
  }

  def prime(p: Int, n: Int = 2): Any= {
    n match {
      case x if (x == p)      => true; //(2==p)
      case x if GCD(p, x) > 1 => false;
      case x                  => prime(p, x + 1);
    }

  }

  def main(args: Array[String]) {
    println(prime(5));
    println(prime(8));
    
  }
}