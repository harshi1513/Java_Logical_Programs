import java.util.Scanner;
class LogicalAnd
  {
    public static void main(String[]args){
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first value");
      a=sc.nextInt();
      System.out.println("enter the second value");
      b=sc.nextInt();
      System.out.println("enter the third value ");
      c=sc.nextInt();
      if(a==b&&b==c&&c==a)
      {
        System.out.println(" numbers are equal");
      }
      else
        System.out.println(" numbers are not equal");    
    }
  }