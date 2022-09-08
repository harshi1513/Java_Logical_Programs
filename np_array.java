//to count total number of negative elements
import java.util.Scanner;
class np_array
  {
    public static void main(String args[])
    {
      int i,n,count=0;
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
          System.out.println("\t" +a[i]);
        }
      for(i=0;i<n;i++)
        {
          if(a[i]<0)
          {
            count++;
          }
          
        }
      System.out.println("the number of negative elements are "+count);
      
    }
  }