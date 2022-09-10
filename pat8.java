//daimond pattern
//          0 
//        0 0 0 
//      0 0 0 0 0 
//    0 0 0 0 0 0 0 
//  0 0 0 0 0 0 0 0 0 
//    0 0 0 0 0 0 0 
//      0 0 0 0 0 
//        0 0 0 
//          0 

class pat8
{
public static void main(String args[])
  {
    int i,j,n;
    n=5;
    for(i=1;i<n;i++)
      {
        for(j=i;j<=n;j++)
          {
            System.out.print("  ");
          }
        for(j=1;j<i;j++)
          {
            System.out.print("0 ");
          }
        for(j=1;j<=i;j++)
          {
            System.out.print("0 ");
          }
        System.out.println();
      }
    for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
          {
            System.out.print("  ");
          }
        for(j=i;j<n;j++)
          {
            System.out.print("0 ");
          }
        for(j=i;j<=n;j++)
          {
            System.out.print("0 ");
          }
        System.out.println();
      }
  }
}  
