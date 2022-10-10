class ThrowDemo
  {
    public static void main(String args[])
    {
      try
        {
          ArithmeticException e=new ArithmeticException("hello exception occured");
          throw e;
        }
      catch(ArithmeticException ae)
        {
          System.out.println("exception occured  " + ae.getMessage());
        }
    }
  }