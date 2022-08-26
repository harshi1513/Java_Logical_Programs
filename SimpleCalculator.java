import java.util.Scanner;
class SimpleCalculator
  {
    public static void main(String[]args)
    {
      int a,b,c;
      int choice;
      Scanner sc=new Scanner(System.in);
      System.out.println("SIMPLE CALCULATOR");
      System.out.println("1.ADDITION");
      System.out.println("2.SUBTRACTION");
      System.out.println("3.MULTIPLICATION");
      System.out.println("4.DIVISION");
      System.out.println("5.REMAINDER");
      System.out.println("enter your choice:");
       choice=sc.nextInt();
      if (choice>=1&&choice<=5)
      {
      System.out.println("enter two inputs a and b");
       a=sc.nextInt();
       b=sc.nextInt();
         switch(choice)
        {
          case 1:
            int add=a+b;
            System.out.println("result is "+add);
            break;
          case 2:
            int sub=a-b;
            System.out.println("result is "+sub);
            break;
          case 3:
            int mul=a*b;
            System.out.println("result is "+mul);
            break;
          case 4:
            int div=a/b;
            System.out.println("result is "+div);
            break;
          case 5:
            int rem=a%b;
            System.out.println("result is "+rem);
            break;
        }
      }
      else
      {
         System.out.println("select the correct choice"); 
      }
    }
  }