
//method overriding
import java.util.Scanner;

class first {
  int sq, n = 5;

  void square() {
    sq = n * n;
    System.out.println("the square of " + n + " is " + sq);
  }
}

class second extends first {
  int m = 3;

  void square() {
    sq = m * m;
    System.out.println("the square of " + m + " is " + sq);
  }
}

class Method_overriding {
  public static void main(String args[]) {
    first f = new first();
    // f.square();
    second d = new second();
    // d.square();
    first b;
    b = f;
    b.square();
    b = d;
    b.square();

  }
}