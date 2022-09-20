import java.util.Scanner;
class perfect_number
  {
    Scanner sc=new Scanner(System.in);
    static int i,sum=0,n;
    static int perfectno(int a)
    {
      for(i=1;i<a;i++)
        {
        if(a%i==0) 
        {
          sum=sum+i; 
        }        
    }
      return sum;
    }
  }
   
class perfectnumber
  {
    public static void main(String args[])
    {
       int a,sum;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the  number");
      a=sc.nextInt();
      
      perfect_number pn=new perfect_number();
      sum=perfect_number.perfectno(a);
      if(sum==a)
      {
        System.out.println("perfect number");
      }
      else
      {
        System.out.println("not a perfect number");
      }
    }
  }