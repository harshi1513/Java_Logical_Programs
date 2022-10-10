class Thread1
{
   public static void main(String args[])
   {
         Thread t=Thread.currentThread();

         System.out.println("The Current Thread is :"+t);

         t.setName("Karun");

         System.out.println("The Current Thread is :"+t);
           t.setPriority(2);
      System.out.println("The Current Thread is :"+t);
     
    }
}