import java.util.Scanner;
class CurrentBill
  {
    public static void main(String[]args)
    {
      int consumerno;
      String consumername;
      double pmr,lmr;
      double tu;
      double bill;
      
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the consumer number :");
      consumerno=sc.nextInt();
      System.out.println("enter the consumer name :");
      consumername=sc.next();
      System.out.println("enter the present month reading :");
      pmr=sc.nextFloat();
      System.out.println("enter the last month reading :");
      lmr=sc.nextFloat();

      tu=pmr-lmr;
     
      if(tu<=50)
      {
       bill=tu*3.40;
      }
      else if(tu<=100)
      {
        bill=50*3.40+(tu-50)*4.56;
      }
      else if(tu<=200)
      {
        bill=50*3.40+50*4.56+(tu-100)*5.43;
      }
      else if(tu<=300)
      {
        bill=50*3.40+50*4.56+100*5.43+(tu-100)*6.54;
      }
      else 
      {
        bill=50*3.40+50*4.56+100*5.43+100*6.54+(tu-300)*7.54;
      }
      
       System.out.println("Consumer Number:"+consumerno);
       System.out.println("Consumer Name:"+consumername);
       System.out.println("present month reading : "+pmr);
       System.out.println("last month reading : "+lmr);
       System.out.println("Total Units:"+tu);
       System.out.println("Current Bill:"+bill);
      
    }
  }
      
      
      