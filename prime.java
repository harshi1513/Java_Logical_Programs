import java.util.Scanner;
class prime_number
  {
    int i,count=0;
   
    void is_prime(int n)
    {
     
      for(i=1;i<=n;i++)
        {
         if(n%i==0)
         {
           count++;
         }
        }
      if(count==2)
      {
        System.out.println("it is a prime number");
      }
      else
        System.out.println("not a prime number");
    }
  }
class prime
  {
    public static void main(String args[])
    {
      int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
      n=sc.nextInt();
      prime_number pn=new prime_number();
      pn.is_prime(n);
    }
  }