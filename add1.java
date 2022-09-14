import java.util.Scanner;
  class addition
    {
      int c;
      
      void add(int a,int b)
      {
        c=a+b;
System.out.println("the addition of two numbers are "+c);
      }
      
    }
class add1
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
     addition ad=new addition();
      ad.add(a,b);
    }
  }