//to check whether a number is a palinfrome or not
import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      int n,r=0,d=0,t;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      t=n;
      while(n>0)
        {
          d=n%10;
          r=r*10+d;
          n=n/10;
        }
      if(r==t)
        System.out.println("Number is a palindrome");
      else
        System.out.println("Number is not a palindrome");   
    }
  }