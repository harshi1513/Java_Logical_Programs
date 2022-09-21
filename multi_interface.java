import java.util.Scanner;
class basec
  {
    int n;
    void read()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();   
    }
  }
interface factor
  {
    public void fact();
  }
class factorial extends basec implements factor
  {
    int f=1,i;
    public void fact()
    {
      for(i=1;i<=n;i++)
        f=f*i;
      System.out.println("the factorial of the given number is : "+f);
    }
  }
class multi_interface
  {
    public static void main(String args[])
    {
      factorial f1=new factorial();
      f1.read();
      f1.fact();
    }
  }