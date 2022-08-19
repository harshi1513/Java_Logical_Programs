import java.util.Scanner;
class Swap2
  {
    public static void main(String[]args){
      float a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a");
      a=sc.nextFloat();
      System.out.println("enter the value of b");
      b=sc.nextFloat();
      System.out.println("before swapping");
       System.out.println("the value of a is:"+a);
      System.out.println("the value of b is:"+b);
      a=a+b;
      b=a-b;
      a=a-b;
      
      System.out.println("after swapping");
      System.out.println("the value of a is:"+a);
      System.out.println("the value of b is:"+b);
      
    }
  }