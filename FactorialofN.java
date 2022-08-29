//factorial of given number 
import java.util.Scanner;
class FactorialofN
{
  public static void main(String[]args)
  {
    int i,n,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    n=sc.nextInt();
    
    for(i=1;i<=n;i++)
      {
       fact=fact*i; 
      }
    System.out.println("the factorial of " +n+" numbers is " +fact);
  }
}