import java.util.Scanner;
class CurrentBill
  {
    public static void main(String[]args)
    {
      int consumerno;
      String consumername;
      float pmr,lmr;
      float tu;
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
      bill=tu*3.80;//cost per unit=3.80//

      System.out.println("Consumer Number:"+consumerno);
      System.out.println("Consumer Name:"+consumername);
      System.out.println("present month reading : "+pmr);
      System.out.println("last month reading : "+lmr);
      System.out.println("Total Units:"+tu);
      System.out.println("Current Bill:"+bill);
    }
  }
      
      
      