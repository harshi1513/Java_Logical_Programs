//heirarchial inheritance
import java.util.Scanner;
class Heirarchial
  {
    public static void main(String args[])
    {
     Factt f=new Factt();
      Addi ad=new Addi();
      f.read();
      f.fact();
      ad.read();
      ad.sum();
    }
  }
class Base
  {
    int n;
    Scanner sc=new Scanner(System.in);
    void read()
    {
      System.out.println("enter the number");
      n=sc.nextInt();
    }
  }
class Factt extends Base
  {
    int fact=1;
   void fact()
    {
      for(int i=1;i<=n;i++)
        {
         fact=fact*i; 
        }
      System.out.println("the result of factorial is "+fact);
    }
  }
 class Addi extends Base
  {
  int sum=0;
    void sum()
    {
      for(int i=1;i<=n;i++)
        {
         sum=sum+i; 
        }
      System.out.println("the sum of " + n + " numbers is "+sum);
    }
  
  }