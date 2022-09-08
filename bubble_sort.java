import java.util.Scanner;
class bubble_sort
  {
    public static void main(String args[])
    {
      int n,i,j,t;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements to be sorted");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("before sorting");
      for(i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }  
      for(i=0;i<n-1;i++)
        {
          for(j=0;j<n-1-i;j++)
            {
              if(a[j]>a[j+1])
              {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
              }
            }
        }
      System.out.println("after sorting");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
  }