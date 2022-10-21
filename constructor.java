class Condemo1
  {
    int a,b;
   Condemo1()
    {
      System.out.println("Its Non Parameterized Constructor");
    }
    Condemo1(int n)
    {
  System.out.println("The n value is:"+n);
    }
   Condemo1(int x,int y) // Parameterized Constructor
    {
       a=x;
       b=y;
    }
    void display()
    {
      System.out.println("The A value is:"+a);
      System.out.println("The B value is:"+b);
      System.out.println("The Addition value is:"+(a+b));
    }
  }
class constructor
  {
     public static void main(String args[])
     {
       int m=23,n=54;
       Condemo1 c1=new Condemo1(m,n);
       c1.display();   
       Condemo1 c2=new Condemo1(100);
       Condemo1 c3=new Condemo1();
     }
  }