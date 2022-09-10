/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

public static void main(String args[])
  {
    int i,j,max;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows");
    int r=sc.nextInt();
    System.out.println("enter the number of columns");
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
          {
          System.out.print("enter ["+i+ "] [ "+j+"] :\t");
            a[i][j]=sc.nextInt();
          }   
      }
    System.out.println("before transpose matrix");
    for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
          {
            System.out.print("  "+ a[i][j] );
          }
        System.out.println();
      }
    System.out.println("after transpose matrix");
     for(i=0;i<c;i++)
      {
        for(j=0;j<r;j++)
          {
            System.out.print("  "+ a[j][i]);
          }
        System.out.println();
      }
    
    
  }
}