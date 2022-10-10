import java.util.Scanner;
class Cons
  {
    public static void main(String args[])
    {
     Constructor con=new Constructor(); 
    }
  }
class Constructor
  {
    Constructor()
    {
      int a;
      int b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the two numbers");
      a=sc.nextInt();
      b=sc.nextInt();
      //int c=a+b;
      System.out.println("the result is : "+(a+b));
    }
  }