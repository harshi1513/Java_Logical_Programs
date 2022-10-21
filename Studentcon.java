//default constructor
class student
  {
    int a,b,c;
    int avg;
    student()
    {
      a=56;
      b=68;
      c=89;
      avg=(a+b+c)/3;
    }
    void display()
    {
      System.out.println("the marks of the student are "+a+" "+" "+b+" "+ c);
      System.out.println("the average is "+avg);
    }
  }
class Studentcon
  {
    public static void main(String args[])
    {
      student st=new student();
      st.display();
    }
  }