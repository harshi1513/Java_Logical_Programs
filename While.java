///to print N natural numbers using while loop
import java.util.Scanner;
class While
  {
    public static void main(String[]args)
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      n=sc.nextInt();
      int i=1;
      while(i<=n)
        {
          System.out.println(i);
          i++;
        }
    }
  }