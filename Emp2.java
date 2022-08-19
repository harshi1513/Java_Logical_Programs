import java.util.Scanner;
class Emp2
  {
    public static void main(String args[])
    {
     
      int eno;
      String ename;
      float esal;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the Employee Number");
      eno=sc.nextInt();
      System.out.println("enter the Employee Name");
      ename=sc.next();
      System.out.println("enter the Employee Salary");
      esal=sc.nextFloat();
      
      
      System.out.println("The given Employee Number is "+eno);
      System.out.println("The given Employee Name is "+ename);
      System.out.println("The given Employee Salary is "+esal);
      
    }
  }