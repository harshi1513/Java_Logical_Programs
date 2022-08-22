import java.util.Scanner;
class Report
  {
    public static void main(String[]args){
    int pno;
    String pname;
    float pcost,pqty;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the product number");
      pno=sc.nextInt();
      System.out.println("enter the product name");
      pname=sc.next();
      System.out.println("enter the product cost");
      pcost=sc.nextFloat();
      System.out.println("enter the product quantity");
      pqty=sc.nextFloat();
      float bill=pcost*pqty;

      System.out.println("product number : "+pno);
      System.out.println("product name : "+pname); 
      System.out.println("product cost : "+pcost);
      System.out.println("product quantity : "+pqty);
      System.out.println("bill : "+bill);   
  }
}