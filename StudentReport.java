import java.util.Scanner;
class StudentReport
  {
    public static void main(String[]args)
    {
      int stdno;
      String stdname;
      int marks1,marks2,marks3;
      int total,average;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the student number :");
      stdno=sc.nextInt();
      System.out.println("enter the student name :");
      stdname=sc.next();
      System.out.println("enter the marks of subject 1 :");
      marks1=sc.nextInt();
      System.out.println("enter the marks of subject 2 :");
      marks2=sc.nextInt();
      System.out.println("enter the marks of subject 3 :");
      marks3=sc.nextInt();
      total=marks1+marks2+marks3;
      average=(total)/3;

      System.out.println("Student Number:"+stdno);
      System.out.println("Student Name:"+stdname);
      System.out.println("Total Marks:"+total);
      System.out.println("Average marks:"+average);
      
    }
  }