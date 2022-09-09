//to extract first and last digit
import java.util.Scanner;
class fl_digit
  {
    public static void main(String args[])
    {
      int n,num,l=0,f=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      num=n;
      
         l=n%10;//to extract last digit
        
      
      while(n>0)
        {
          f=n%10;//to extract first digit
          n=n/10;
        }
      System.out.println("the first digit is "+f);
      System.out.println("the last digit is "+l);
    }
  }