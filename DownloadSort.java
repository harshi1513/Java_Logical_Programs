import java.util.Scanner;
class Sort
  {
    int n,i,t,j;
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
          System.out.println(a[i]);
        }
    }
    void sortarray(int a[],int n)
    {
      for(i=1;i<=n-1;i++)
         {
           for(j=i;j>0 && a[j-1]>a[j];j--)
             {
                 t=a[j];
                 a[j]=a[j-1];
                 a[j-1]=t;
              }   
           }
    }
  }
class DownloadSort
  {
  public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      Sort s=new Sort();
      System.out.println("enter the array elements");
      s.acceptarray(a,n);
      System.out.println("before sorting");
      s.disparray(a,n);
      s.sortarray(a,n);
      System.out.println("after sorting");
      s.disparray(a,n);
    }
  }