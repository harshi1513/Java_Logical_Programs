import java.util.Scanner;
class SumofN
{
  public static void main(String[]args)
  {
    int i,n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    n=sc.nextInt();
    
    for(i=1;i<=n;i++)
      {
       sum=sum+i; 
      }
    System.out.println("the sum of " +n+" numbers is " +sum);
  }
}