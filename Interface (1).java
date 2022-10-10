//use of interface
interface  Main
  {
    public void add();
    public void display();
  }
class Sub implements Main
{
  int a=10,b=30,sum;
  public void add()
  {
   sum=a+b; 
  }
  public void display()
  {
    System.out.println("the first number is "+a);
    System.out.println("the second number is "+b);
    System.out.println("the addition value is "+sum);
  }
}
class Interface
  {
    public static void main(String args[])
    {
     Sub s=new Sub();
      s.add();
      s.display();
    }
  }
