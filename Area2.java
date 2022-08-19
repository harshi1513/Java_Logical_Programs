import java.util.Scanner;
class Area2
  {
    public static void main(String args[])
    {
     int r;
    double pi=3.14;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the radius");
      r=sc.nextInt();
      
      
    System.out.println("the area of circle is " +(pi*r*r));
      
    }
  }