//arithmetic exception
import java.util.Scanner;
class Division
  {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    void div()
    {
      try
        {
          System.out.println("enter the two numbers");
          a=sc.nextInt();
          b=sc.nextInt();
          c=a/b;
          System.out.println("the answer is "+c);
        }
      catch(ArithmeticException e)
        {
          System.out.println("exception occured");
          System.out.println("exception occured " +e);
          System.out.println("exception occured " +e.getMessage());
        }
    }
  }
class Excep
  {
    public static void main(String args[])
    {
      Division dv=new Division();
      dv.div();
    }
  }