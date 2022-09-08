//to find the frequency of element
import java.util.Scanner;
class frequency
  {
    public static void main(String args[])
    {
      int i,n,j;
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      boolean v[]=new boolean[n];
      
      System.out.println("enter the array elements");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
        {
          v[i]=false;
        }
      System.out.println("element count");
      
      for(i=0;i<n;i++)
        {
          if(v[i]==true)
           continue;
          int count=1;
          for(j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
              {
                v[j]=true;
              count++;
              }
            }
         System.out.println("the element "+a[i]+ " count is "+count); 
        }
      
    }
  }