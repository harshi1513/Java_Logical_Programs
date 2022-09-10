import java.util.Scanner;
class pn
  {
    public static void main(String args[])
    {
    int num1,num2,count;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the starting number");
      num1=sc.nextInt();
    System.out.println("enter the ending number");
      num2=sc.nextInt();


  for(int i = num1; i <= num2; i++) {
   count = 0;
   for(int j = 2; j <= i/2 ; j++) {
    if(i % j == 0) {
     count++;
     break;
    }
   }

   if(count == 0) {
    System.out.println(i);
   }

  }
 }
}