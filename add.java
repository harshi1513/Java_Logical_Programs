import java.util.Scanner;
  class addition
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      void add()
      {
        System.out.println("enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
System.out.println("the addition of two numbers are "+c);
      }
      
    }
class add
  {
    public static void main(String args[])
    {
     addition ad=new addition();
      ad.add();
    }
  }