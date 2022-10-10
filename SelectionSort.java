import java.util.Scanner;
class Selection
  {
    int i,j,t;
    Scanner sc=new Scanner(System.in);
    void acceptarray(int a[],int n)
    {
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
    }
      void disparray(int a[],int n)
        {
        for(i=0;i<n;i++)
          {
            System.out.println("the array is "+a[i]);
          }
        }
      void sortarray(int a[],int n)
        {
        for(i=0;i<n-1;i++)
          {
            for(j=i+1;j<n;j++)
              {
                if(a[i]>a[j])
                {
                  t=a[i];
                  a[i]=a[j];
                  a[j]=t;
                }
              }
          }
        }
    }
  class SelectionSort
    {
      public static void main(String args[])
      {
        int n;
         Selection s=new Selection();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter the array elements");
        s.acceptarray(a,n);
        System.out.println("elements before sorting");
        s.disparray(a,n);
        s.sortarray(a,n);
        System.out.println("elements after sorting");
        s.disparray(a,n);
        
        
      }
    }