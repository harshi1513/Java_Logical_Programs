import java.util.Scanner;
class Armstrong
  {
    int d,sum=0;
    int armstrong(int n)
    {
    
      while(n>0)
        {
          d=n%10;
          sum=sum+(d*d*d);
          n=n/10;
        }
     return sum;
        
    } 
  }
class arms
  {
    public static void main(String args[])
    {
      int n,num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      num=n;
      Armstrong am=new Armstrong();
      int s=am.armstrong(n);
      if(num==s)
        System.out.println("armstrong number");
      else
        System.out.println("not an armstrong number");
    }
  }