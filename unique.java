import java.util.Scanner;

class unique {
  public static void main(String args[]) {
    int i, j, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    n = sc.nextInt();
    int a[]=new int[n];
    boolean visited[]=new boolean[n];
    System.out.println("enter the array elements ");
    for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    for(i=0;i<n;i++)
      {
        visited[i]=false;
      }
    System.out.println("the unique element is");
    for(i=0;i<n;i++)
      {
      if(visited[i]==true)
        continue;

        int count=1;
        for(j=i+1;j<n;j++)
          {
            if(a[i]==a[j])
            {
              visited[j]=true;
              count++;
            }
          }
        if(count==1)
        
          System.out.println(" " +a[i]);
        
      }

  }
}