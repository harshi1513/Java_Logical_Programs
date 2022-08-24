import java.util.Scanner;
class Student
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
      
      if(marks1>=40 && marks2>=40 && marks3>=40)
       {
        System.out.println("Result:PASS");
         if(average<=50)
        { 
         System.out.println("grade C"); 
        }
         else if(average>=51&&average<=70)
        {
         System.out.println("grade B");
        }
        else if(average>=71&&average<80)
        {
         System.out.println("grade A");
        }
         else if(average>=80)
        {
         System.out.println("Student passed with DISTINCTION");
        }
      }
      else
         {
           System.out.println("Result:FAIL"); 
         }
   }
  }