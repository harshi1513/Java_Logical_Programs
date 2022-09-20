import java.util.Scanner;
class base
  {
    int sno;
    String sname;
    void input()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the student number");
    sno=sc.nextInt();
    System.out.println("enter the student name");
    sname=sc.next();
    }  
  }
class derive1 extends base
{
 int m1,m2,m3;
  int avg,total;
  void avg()
  {
    Scanner sc=new Scanner(System.in);
  System.out.println("enter the three subjects marks");
  m1=sc.nextInt();
  m2=sc.nextInt();
  m3=sc.nextInt();
  total=m1+m2+m3;
    avg=total/3;
  }
}
class derive2 extends derive1
{
  void report()
  {
  System.out.println("student number: "+sno);
  System.out.println("student name: "+sname);
  System.out.println("total average: "+avg);
  }
}
class inherit
  {
    public static void main(String args[])
    {
     derive2 d2=new derive2();
      d2.input();
      d2.avg();
      d2.report();
    }
  }