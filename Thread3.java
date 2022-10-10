//custom thread
//using runnable interface
import java.util.*;
class ThreadB implements Runnable
  {
    public void run()
    {
      System.out.println("Hello is my current thread");
    }
  }
class Thread3
{
  public static void main(String args[])
  {
    ThreadB t=new ThreadB();
    Thread th=new Thread(t);
    th.start();
    System.out.println("main");
  }
}