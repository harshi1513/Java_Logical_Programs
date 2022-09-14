import java.util.Scanner;
class Factorial
  {
    int i,n,f=1;
    void fact()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
     for(i=1;i<=n;i++)
       {
         f=f*i;
       }
System.out.println("the factorial of the given number is:"+f);
    }
  }

class Fact
  {
    public static void main(String args[])
    {
      
      Factorial fc=new Factorial();
      fc.fact();
      
    }
  }