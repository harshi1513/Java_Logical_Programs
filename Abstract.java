
//abstract method and class
import java.util.Scanner;

abstract class Abd {
  abstract void calculate(int n);
}

class Sq extends Abd {
  void calculate(int n) {
    System.out.println("the square of the given number " + Math.pow(n, 2));
  }
}

class Cube extends Abd {
  void calculate(int n) {
    System.out.println("the cube of the given number " + Math.pow(n, 3));
  }
}

class Sqrt extends Abd {
  void calculate(int n) {
    System.out.println("the square root of the given number is " + Math.sqrt(n));
  }
}

class Abstarct {
  public static void main(String args[]) {
    Sq s = new Sq();
    Cube c = new Cube();
    Sqrt t = new Sqrt();
    s.calculate(5);
    c.calculate(8);
    t.calculate(625);
  }
}