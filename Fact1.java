import java.util.Scanner;
class Fact1
{
  public static void main(String[]args)
  {
    int i,n,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    n=sc.nextInt();
    
    for(i=n;i>=1;i--)
      {
       fact=fact*i; 
      }
    System.out.println("the factorial of " +n+" numbers is " +fact);
  }
}