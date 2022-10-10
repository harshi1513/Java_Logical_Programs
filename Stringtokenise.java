import java.util.Scanner;
import java.util.StringTokenizer;
class Stringtokenise{
  public static void main(String args[]){
    String st1="hai hello welcome to bitlabs";
    StringTokenizer t=new StringTokenizer(st1);
    System.out.println("The given number of String are "+t.countTokens());
    System.out.println("The tokens are ");
    {
      while(t.hasMoreTokens())
        {
          System.out.println(t.nextToken());
        }
    }
  }
}