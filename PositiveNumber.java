import java.util.Scanner;
class PositiveNumber
  {
    public static void main(String[]args){
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      num=sc.nextInt();
      
       if(num>0)
      {
         System.out.println("positive number");
      }
       else
      {
         System.out.println("not a positive number");
      }
    }
  }