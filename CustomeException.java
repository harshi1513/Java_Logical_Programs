import java.io.*;
import java.util.Scanner;
import java.lang.*;
class MyException extends Exception 
{ 
 public MyException()  
 { 
 //super("Error Occured"); 
   System.out.println("error occured");
 } 
} 
public class CustomeException
{ 
 public static void main(String args[]) //throws IOException 
 { 
 int a,b,c;
   Scanner sc=new Scanner(System.in);
 //BufferedReader br=new BufferedReader ( 
 //new InputStreamReader(System.in)); 
 try 
 { 
 System.out.println("Enter 2 values : "); 
 a=sc.nextInt();
 b=sc.nextInt();
 if(b==0) 
 throw new MyException(); 
 c=a/b; 
 System.out.println("Division : "+c); 
 } 
 catch(MyException e) 
 { 
 System.out.println(e.getMessage()); 
 } 
 } 
} 