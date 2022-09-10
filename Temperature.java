/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

public static void main(String args[])
  {
    int n,i,j;
    double min;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of days");
    n=sc.nextInt();
    double a[]=new double[n];
    for(i=0,j=1;i<n;i++,j++)
    {
    System.out.println("enter the temperature of day :"+j);    
        a[i]=sc.nextDouble();
      }  
    min=a[0];
    for(i=0;i<n;i++)
      {
        if(min>a[i])
        {
          min=a[i];
        }
      }
    System.out.println("the lowest temperature of week is "+min+ " celcius");
    
  }

}