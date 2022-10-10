//constructor overloading//parameterized constructor
import java.util.Scanner;
class ConsP
  {
    public static void main(String args[])
    {
      Constructor1 con=new Constructor1();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to find factorial");
      int n=sc.nextInt();
      Constructor1 con1=new Constructor1(n);
      System.out.println("enter the two numbers for addition");
      int a=sc.nextInt();
      int b=sc.nextInt();
      Constructor1 con2=new Constructor1(a,b);
      con2.display();
    }
  }
class Constructor1
  {
    int x,y;
   Constructor1()
    {
      int z=10;
      System.out.println("the value of a is :"+z);
    }
    Constructor1(int n)
    {
      int fact=1;
      for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
      System.out.println("the factorial is : "+fact);
    }
    Constructor1(int a,int b)
    {
       x=a;
       y=b;
      //int c=a+b;
    }
   void display()
        {
        System.out.println("the value of a is : "+x);
        System.out.println("the value of b is : "+y);
        System.out.println("the addition of two numbers is : "+(x+y)); 
        }
      
    
  }