import java.util.Scanner;
class SumofPositiveInt
  {
    public static void main(String args[]){
      int d=0,sum=0,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enetr the number");
      n=sc.nextInt();
      while(n>0)
        {
          d=n%10;
          sum=sum+d;
          n=n/10;
        }
      System.out.println("the sum of digits of given number is "+sum);
    }
  }