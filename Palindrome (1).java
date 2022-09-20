/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

public static void main(String args[])
  {
    String st = " ", rev = "";
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    st=sc.nextLine();
    
    int n = st.length();

    for (int i = n-1; i >=0; --i) {
      rev = rev + st.charAt(i);
    }

    if (st.toLowerCase().equals(rev.toLowerCase())) {
      System.out.println(st + " is a Palindrome ");
    }
    else {
      System.out.println(st + " is not a Palindrome ");
    }
  }
}