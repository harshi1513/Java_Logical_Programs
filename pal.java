import java.util.Scanner;
class Palindrome
  {
    int d,rev=0;
    int num;
   
    void palindrome(int n)
    {
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
class pal
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      
      Palindrome pl=new Palindrome();
      pl.palindrome(n);
    }
  }