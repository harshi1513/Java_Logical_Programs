//to delete an element from array
import java.util.Scanner;
class delete
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements :");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the elements of array is :");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("enter the index of number to be deleted");
      int index=sc.nextInt();
      for(i=index;i<n-1;i++)
        {
          a[i]=a[i+1];
        }
      n=n-1;
      System.out.println("the new array is ");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
  }