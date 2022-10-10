//CUSTOM THREAD
//creating thread using extend thread class method
//import java.io.*;
// import java.lang.*;
class Thread2
  {
    public static void main(String args[])
    {
      ThreadA th=new ThreadA();
      th.start();
    }
  }
class ThreadA extends Thread
  {
   public void run()
    {
    System.out.println("the current thread A is HELLO WORLD");
      for(int i=1;i<=5;i++)
        {
          System.out.println("current thread is "+i );
        }
    }
  }