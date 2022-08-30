//prime number
import java.util.Scanner;
class PrimeNumber
  {
    public static void main(String args[])
    {
      int n,i=1,c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      while(i<=n)
        {
          if(n%i==0)
          {
            c++;
          }
          i++;
        }
      if(c==2)
        System.out.println("it is a prime number");
      else
        System.out.println("it is not a prime number");
        
    }
  }