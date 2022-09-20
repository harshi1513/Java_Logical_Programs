import java.util.Scanner;
class bubble_sort
  {
    Scanner sc=new Scanner(System.in);
    int i,t=0,j;
    void accept_array(int a[],int n)
    {
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      
    }
    void display_array(int a[],int n)
    {
     for(i=0;i<n;i++)
       {
         System.out.println(" \t " +a[i]);
       }
    }
    void sort_array(int a[],int n)
    {
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
    }
  }
class bubble
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      bubble_sort bs=new bubble_sort();
      System.out.println("enter the array elements");
      bs.accept_array(a,n);
      System.out.println("before sorting");
      bs.display_array(a,n);
       bs.sort_array(a,n);
      System.out.println("after sorting");
      bs.display_array(a,n);
    }
  }