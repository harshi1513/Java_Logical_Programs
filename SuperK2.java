// using super keyword with subclass method
class parent
  {
    void display()
    {
      System.out.println("this is parent class");
    }
  }
class child extends parent
{
void display()
  {
    super.display();
    System.out.println("this is child class");
  }
}
class SuperK2
  {
    public static void main(String args[])
    {
      child ch=new child();
      ch.display();
    }
  }