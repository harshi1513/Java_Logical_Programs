import java.util.Scanner;
class Check
  {
    public static void main(String[]args){
     char ch;
        
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character");
      ch=sc.next().charAt(0);
      if(ch>=65&&ch<=122)
      {
        System.out.println("it is an alphabet");
      if(ch>=65&&ch<=90)
        System.out.println("capital letter alphabet");
      else
        System.out.println("small letter alphabet");
      }
      else if(ch>=48&&ch<=57)
        System.out.println("it is a digit");
      else 
        System.out.println("it is a special character");
    }
  }