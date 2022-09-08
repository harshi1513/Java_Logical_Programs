//copying elements of one array to other
import java.util.Scanner;
class copy
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      System.out.println("enter the array elements of array A");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();  
        }
      for(i=0;i<n;i++)
        {
       b[i]=a[i];
        }
      System.out.print("Array B is :");
      for(i=0;i<n;i++)
        {
          System.out.print(" "+b[i]);
        }
      

        }
  }