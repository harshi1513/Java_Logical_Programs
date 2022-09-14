import java.util.Scanner;
class factoril
  {
    int i,f=1;
    void fact(int n)
    {
  
      for(i=1;i<=n;i++)
        {
          f=f*i;
        }
  System.out.println("the factorial of the given number is "+f);
    }
  }
class Fact1
  {
    public static void main(String args[])
    {
      int n=5;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      factoril fc=new factoril();
      fc.fact(n);
    }
  }