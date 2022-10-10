
import java.util.*;
class index
  {
    public static void main(String args[])
    {
      String s;
      char ch;
      int i,c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      s=sc.nextLine();
      System.out.println("Enter the character that needed to be found");
        ch=sc.next().charAt(0);

      for(i=0;i<s.length();i++)
        {
          if(s.charAt(i)==ch)
          {
            System.out.println("The character "+ch+" appears at possition "+i);
            c++;
          }
        }
     System.out.println("The character "+ch+" appears "+c+" times");
      
    }
  }

