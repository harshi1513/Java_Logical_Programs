import java.util.Scanner;
class AbsoluteValue
  {
    public static void main(String[]args){
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      
       if(n<0)
      {
         n=-n;
      }
      
      System.out.println("the absolute value is : "+n);  
    }
  }