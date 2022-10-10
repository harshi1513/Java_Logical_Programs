//use of SUPER KEYWORD
class Parent
  {
    int n=10;
  }
class Child extends Parent
{
 int n=50;
void display()
  {
  System.out.println("the value in parent class is "+super.n);
    System.out.println("the value in child class is "+n);
  }
}
class SuperK
  {
    public static void main(String args[])
    {
      Child ch=new Child();
      ch.display();
    }
  }