import java.util.Scanner;
class highfreq
  {
    public static void main(String args[])
    {
      String s;
     
    int i,j,n,max=0,charindex=0;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string ");
     s=sc.nextLine();
    n=s.length();
    boolean visited[]=new boolean[n];
    for (i=0;i<n;i++)
      {
     
        visited[i]=false;
      }
     for(i=0;i<n;i++)
       {
         if(visited[i]==true)
           continue;
       
       int c=1;
    for(j=i+1;j<n;j++)
      {
        if(s.charAt(i)==s.charAt(j))
        {
          visited[j]=true;
        c++;
        }
      }
        if(max<c)
        {
          max=c;
          charindex=i;
        }
         
  }
     System.out.println("Highest frequency character is "+s.charAt(charindex)+" which occurs "+max+" times");
  }
}
