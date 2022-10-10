 final class parents
  {
   final void display() //to prevent over riding
    {
      System.out.println("this is base class");
    }
  }
class childs // extends parents//it prevents inheritance
  {
    void display()
    {
      System.out.println("this is derive class");
    }
  }
class FinalK2
  {
    public static void main(String args[])
    {
      childs ch=new childs();
      ch.display();
    }
  }