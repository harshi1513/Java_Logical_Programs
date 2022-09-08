import java.util.Scanner;
class addition_of_matrix
  {
    public static void main(String args[])
    {
      int i,j;
      int r1,c1,r2,c2;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of rows for matrix A");
      r1=sc.nextInt();
      System.out.println("enter the number of coloumn for matrix A ");
      c1=sc.nextInt();
      System.out.println("enter the number of rows for matrix B");
      r2=sc.nextInt();
      System.out.println("enter the number of coloumn for matrix B ");
      c2=sc.nextInt();
      int a[][]=new int[r1][c1];
      int b[][]=new int[r2][c2];
      int c[][]=new int[r1][c1];
      if(r1==r2&&c1==c2)
      {
        System.out.println("enter the elements of matrix A");
        for(i=0;i<r1;i++)
          {
            for(j=0;j<c1;j++)
              {
                a[i][j]=sc.nextInt();
              }
          }
        System.out.println("enter the elements of matrix B");
        for(i=0;i<r2;i++)
          {
            for(j=0;j<c2;j++)
              {
                b[i][j]=sc.nextInt();
              }
          }
        
        for(i=0;i<r1;i++)
          {
            for(j=0;j<c1;j++)
              {
                c[i][j]=a[i][j]+b[i][j];
              }
          }
        System.out.println("matrix A is :");
        for(i=0;i<r1;i++)
          {
            for(j=0;j<c1;j++)
              {
                System.out.print(" "+a[i][j]);
              }
            System.out.println();
          }
         System.out.println("matrix B is :");
        for(i=0;i<r2;i++)
          {
            for(j=0;j<c2;j++)
              {
                System.out.print(" "+b[i][j]);
              }
            System.out.println();
          }
         System.out.println("matrix C is :");
        for(i=0;i<r1;i++)
          {
            for(j=0;j<c1;j++)
              {
                System.out.print(" "+c[i][j]);
              }
            System.out.println();
          }
      }
      else
      {
        System.out.println("matrix addition not possible");
      }
      
    }
  }