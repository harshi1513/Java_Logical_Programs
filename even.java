//tp print even numbers upto given numbers using while loop
import java.util.Scanner;
class even
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      i=1;
    while(i<=n)
      {
      if(i%2==0)  
        System.out.println(i);
        i++;
      }   
    }
  }