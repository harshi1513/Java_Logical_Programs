import java.util.Scanner;
class Table
{
  public static void main(String[]args)
  {
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    n=sc.nextInt();
    
    for(i=1;i<=10;i++)
      {
        System.out.println(n+"x"+i+"="+n*i);
      }
  }
}