import java.util.Scanner;
class Rectangle
  {
    public static void main(String args[])
    {
     float l,b;
    float area,perimeter;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the length");
      l=sc.nextFloat();
      System.out.println("enter the breadth");
      b=sc.nextFloat();
      area=l*b;
      perimeter=(l+b)*2;
      
    System.out.println("the area of rectangle is " +area);
       System.out.println("the perimeter of rectangle is " +perimeter);
      
    }
  }