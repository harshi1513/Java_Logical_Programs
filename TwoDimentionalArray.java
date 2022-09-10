/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {

public static void main(String args[])
  {
    int i,j,max;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows and columns");
    int r=sc.nextInt();
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
    max=a[0][0];
    int x=0;
    int y=0;
    for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
          {
            if(max<a[i][j])
              max=a[i][j];
               x=i;
               y=j;
          } 
      }
    System.out.println("Largest element in array is "+max+ " and its index position is a [ " +x+ " ] [ " +y+ " ]");
  }

}