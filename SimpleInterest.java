//to find the simole interest//
import java.util.Scanner;
class SimpleInterest
  {
    public static void main(String[]args)
    {
      float P,R,T;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the principle amount");
        P=sc.nextFloat();
       System.out.println("enter the rate of interest");
        R=sc.nextFloat();
       System.out.println("enter the Total number of months");
        T=sc.nextFloat();
       float SI=(P*T*R)/100;
      System.out.println(" simple interest is :"+SI);
       float  TotalAmount=P+SI;
      System.out.println("total amount is : "+TotalAmount);     
    }
  }