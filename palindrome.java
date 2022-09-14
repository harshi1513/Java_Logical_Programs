import java.util.Scanner;
class pal
  {
    int d,n,rev=0;
    int num;
    Scanner sc=new Scanner(System.in);
    void palindrome()
    {
      System.out.println("enter the number");
      n=sc.nextInt();
      num=n;
      while(n>0)
        {
      d=n%10;
      rev=(rev*10)+d;
      n=n/10;
        }
      if(rev==num)
      {
        System.out.println("the number is a palindrome");
      }
      else
      {
        System.out.println("the number is not a palindrome");
      }
    }
  }
class palindrome
  {
    public static void main(String args[])
    {
      pal pl=new pal();
      pl.palindrome();
    }
  }