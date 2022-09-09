import java.util.Scanner;
class dup
  {
    public static void main(String args[])
    {
      int i,j,cnt=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      boolean visited[]=new boolean[n];
      System.out.println("enter the array elements");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
        {
        visited[i]=false;  
        }
      System.out.println("the duplicate elements are");
      for(i=0;i<n;i++)
          {
        if(visited[i]==true)
        {
          continue;
        }
            int count=1;
            for(j=i+1;j<n;j++)
              {
                if(a[i]==a[j])
                  {
                  visited[j]=true;
                    count++;
                    cnt++;
                  }
                
              }
            if(count!=1)
            {
                  
                  System.out.println(" " +a[i]);
            }
                
          }
      System.out.print("the number of duplicate elements are "+cnt);
    }
  }