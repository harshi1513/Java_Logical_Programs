import java.util.Scanner;
class Fahrenheit
  {
    public static void main(String[]args){
      float F,C;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the temperature in fahrenheit");
      F=sc.nextFloat();
      C=(F-32)*5/9;
      System.out.println("the conversion from fahrenheit to celcius is : "+C);
    }
  }