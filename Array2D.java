import java.util.Scanner;
class Array2D
  {
    public static void main(String args[])
    {
      int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of rows");
      int r=sc.nextInt();
      System.out.println("enter the number of coloumns");
      int c=sc.nextInt();
      int a[][]=new int[r][c];
      System.out.println("enter the array elements");
      for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("the array is :");
      for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
            {
              System.out.print(" "+a[i][j]);
            }
          System.out.println();
        }

    }
  }