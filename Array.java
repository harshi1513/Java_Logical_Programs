import java.util.Scanner;
class Array
  {
    public static void main(String args[])
    {
      int i,n;
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
          System.out.println("\t" +a[i]);
        }
    }
  }