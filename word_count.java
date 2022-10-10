import java.util.Scanner;
class word_count
  {
    public static void main(String args[])
    {
      String s;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      s=sc.nextLine();
      String []word=s.split(" ");
      System.out.println("the word count of the given string : "+word.length);
      
    }
  }