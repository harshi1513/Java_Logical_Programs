//to find fact using while loop
import java.util.Scanner;
class FactWhile
{
  public static void main(String[]args)
  {
    int n,fact=1;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    n=sc.nextInt();
    int N=n;
    while(n>=1)
      {
        fact=fact*n;
        n--;
      }
    System.out.println("the factorial of " +N+ " is " +fact);
    sc.close();
  }
}