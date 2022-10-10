//method overloading
import java.util.Scanner;
class Factor
  {
    int n=5,fact=1;
    void facto()
    {
      for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
      //System.out.println("the factorial of 5 is "+fact);
    }
    void facto(int x)
    {
      fact=1;
      for(int i=1;i<=x;i++)
        {
          fact=fact*i;
        }
      //System.out.println("the factorial of " +x+ " is "+fact);
    }
    void display()
    {
      System.out.println("the factorial is "+fact);
    }
  }
class Method_overload
  {
    public static void main(String args[])
    {
      int x;
      Factor fc=new Factor();
      fc.facto();
      fc.display();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      x=sc.nextInt();
      fc.facto(x);
      fc.display();
    }
  }