import java.util.Scanner;
class prime_number
  {
    int n,i,count=0;
    Scanner sc=new Scanner(System.in);
    void is_prime()
    {
      System.out.println("enter the number");
      n=sc.nextInt();
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
class primeno
  {
    public static void main(String args[])
    {
      prime_number pn=new prime_number();
      pn.is_prime();
    }
  }