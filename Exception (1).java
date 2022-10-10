//exception
import java.io.*;
import java.lang.*;
  public class Exception
  {
    public static void main(String args[])
    {
      try
        {
          int n=Integer.parseInt("123abc");
          System.out.println("the integer value of n is "+n);

          int b=100;
          int div=100/0;
          System.out.println("the result is "+div);

          int a[]=new int[15];
           a[20]=852;
           System.out.println("the value of a[10] "+a[20]);
        }
      catch(ArrayIndexOutOfBoundsException e)
        {
         System.out.println("exception error " +e.getMessage()); 
        }
      catch(ArithmeticException ex)
        {
          System.out.println("Arithmetic exception .."+ex);
        }
      //catch(Exception ex)
        //{
         // System.out.println("Exception "+ex.getMessage());
       // }
        
    }
  }
  