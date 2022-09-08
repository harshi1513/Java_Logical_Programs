//to search required element in array//linear search
import java.util.Scanner;
class linear_search_in_array
  {
    public static void main(String args[])
    {
      int i,n,ser;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();//size of array is stored in n
      int a[]=new int[n];//to allocate n memory allocation to array
      System.out.println("enter the array elements :");
      for(i=0;i<n;i++)//to store the input in i no of array
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the elements of array is :");
      for(i=0;i<n;i++)//to print i no of array
        {
          System.out.println(+a[i]);
        }
      System.out.println("enter the value for search");
      ser=sc.nextInt();
      
      for(i=0;i<n;i++)
        {
          if(ser==a[i]){
           System.out.println("element found at a["+i+"]") ;
          break;
          }
        }
      if(i==n)
        System.out.println("element not found");
      
    }
  }