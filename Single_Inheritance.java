//single inheritance
import java.util.Scanner;
class Single_Inheritance
  {
    public static void main(String args[])
    {
     derive d=new derive();
      d.add();
      d.mult();
    }
  }
class base
  {
    int a,b;
    base()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the two numbers");
      a=sc.nextInt();
      b=sc.nextInt();
    }
    void add()
    {
      System.out.println("the addition of two numbers is "+(a+b));
    }
  }
class derive extends base
  {
    void mult()
    {
      System.out.println("the multiplication of two numbers is "+(a*b));
    }
  }