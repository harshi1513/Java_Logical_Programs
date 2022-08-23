import java.util.Scanner;
class LeapYear2
  {
    public static void main(String[]args){
      int y;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the year");
      y=sc.nextInt();
      
       if(y%4!=0)
       {
        System.out.println("not a leap year"); 
       }
      else
       {
       if(y%100!=0)
       {
         System.out.println("leap year");
       }
         else
       {
         if(y%400!=0)
         {
           System.out.println("not a leap year");
         }
         else
          { 
           System.out.println("leap year");
          }
        }
         }
       }
  }