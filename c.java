import java.util.Scanner;
class c
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int num=n;
    int d;
      int rev=0;
    while(n>0)
      {
       d=n%10;
         rev=(rev*10)+d;
        n=n/10;
      }
      System.out.println(rev);
      if(rev==num)
      System.out.println("the number is a palindrome");
      else
      System.out.println("the number is a not a palindrome");
  }
}
