//to find the duplicate elements in an array
import java.util.Scanner;
class duplicate
  {
    public static void main(String args[])
    {    
      int i;
    Scanner sc=new Scanner(System.in); 
      System.out.println("enter array size ");  
      int n=sc.nextInt();   
      int a[]=new int[n];   
      boolean visited[]=new boolean[n];  
      System.out.println("Enter the elements of the array ");  
      for (i=0;i<n;i++)   
        {     
          a[i]=sc.nextInt();   
        }    
      for( i=0;i<n;i++)  
        {     
          visited[i]=false;    
        }  
      System.out.println("the  duplicate element :");  
      for(i=0;i<n;i++)      
        {  
          if(visited[i]==true)    
            continue;                  
          int count=1;  
          for(int j=i+1;j<n;j++)  
            {        
              if(a[i]==a[j])  
              {       
                visited[j]=true;     
                count++;            
              }
           }

                if(count!=1)

           System.out.print(" \t" +a[i]);
       }
     }
   }