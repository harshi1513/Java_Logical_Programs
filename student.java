class stud
  {
    int mark1,mark2,mark3;
    int sno;
    String sname;
    double avg;
    stud(double avg)
    {
      this.avg=avg;
    }
    void display(int sno,String sname)
    {
      System.out.println("student number : "+sno);
      System.out.println("student name :"+sname);
      System.out.println("average :"+avg);
    }
  }
class student
  {
    public static void main(String args[])
    {
      int sno=101;
      String sname=" MANGO";
     double avg=80.52;
      
      stud st=new stud(avg);
      st.display(sno,sname);
    }
  }



