import java.util.Scanner;
class emp
  {
    int b;
    String a;
    double c;
    emp(String en,int empid,double salary)
    {
         a=en;
         b=empid;
         c=salary;
    }
    int read(String en,int empid,double salary)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the employee name");
       en=sc.next();
      System.out.println("enter the employee id");
      empid=sc.nextInt();
      System.out.println("enter the salary");
      salary=nextDouble();
      return en;
      return empid;
      return salary;
    }
    void inc_salary()
    {
      int in=10%salary;
      salary=salary+in;
    }
  }
class manager extends emp
  {
    int department;
  }
class employee
  {
    public static void main(String args[])
    {
      String en;
      int empid;
      double salary;
      emp ep=new emp(en,empid,salary);
      en=ep.read(en);
      manager mag=new manager();
      
      
    }
  }