import java.util.Scanner;
class Square {
  public static void main(String[]args){
    int a,b,square;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a");
    a=sc.nextInt();
    System.out.println("enter the value of b");
    b=sc.nextInt();
    
    square=a*a+b*b+2*a*b;
    System.out.println("whole square of (" +a+ "+" +b+ ") is "+square);
  }
}
    