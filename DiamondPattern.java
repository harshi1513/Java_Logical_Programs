/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

public class DiamondPattern {


public static void main(String args[])
  {
    int i,j,n;
    n=4;
    for(i=1;i<n;i++)
      {  
      int k=97;
      
        for(j=i;j<=n;j++)
          {
            System.out.print("  ");
          }
        for(j=1;j<i;j++)
          {
            System.out.print((char)k++ +" ");
          }
        for(j=1;j<=i;j++)
          {
            System.out.print((char)k-- +" ");
          }
        System.out.println();
      }
    for(i=1;i<=n;i++)
      {
        int k=97;
        for(j=1;j<=i;j++)
          {
            System.out.print("  ");
          }
        for(j=i;j<n;j++)
          {
            System.out.print((char)k++ +" ");
          }
        for(j=i;j<=n;j++)
          {
            System.out.print((char)k-- +" ");
          }
        System.out.println();
      }
  }
}  
     
