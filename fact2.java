import java.util.Scanner;
class factorial
  {
    int i,f=1;

    int fact(int n)
    {
  
      for(i=1;i<=n;i++)
        {
          f=f*i;
        }
        return f;
    }
  }
class fact2
  {
    public static void main(String args[])
    {
      int m,z;
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      m=sc.nextInt();
       factorial fc=new factorial();
      z=fc.fact(m);
      System.out.println("the factorial of the given number is "+z);
    }
  }