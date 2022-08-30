import java.util.Scanner;
class reversenumber
  {
    public static void main(String args[])
    {
      int n,r=0,d=0,t;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      t=n;
      for( ;n>0; )
        {
          d=n%10;
          r=r*10+d;
          n=n/10;
        }
        System.out.println(" the reverse number is " +r);   
    }
  }