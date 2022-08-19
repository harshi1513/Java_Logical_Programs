import java.util.Scanner;
class Swap
  {
    public static void main(String[]args){
      float a,b,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a");
      a=sc.nextFloat();
      System.out.println("enter the value of b");
      b=sc.nextFloat();
      System.out.println("before swapping");
       System.out.println("the value of a is:"+a);
      System.out.println("the value of b is:"+b);
      temp=a;
      a=b;
      b=temp;
      System.out.println("after swapping");
      System.out.println("the value of a is:"+a);
      System.out.println("the value of b is:"+b);
      
    }
  }