//  A B C D E
//  F G H I J
//  K L M N O
//  P Q R S T
//  U V W X Y
    





class pattern5
  {
    public static void main(String args[])
    {
      
      int i,j;
      
       
       int n=65;
       char ch=(char)n;
      for(i=1;i<=5;i++) 
    { 
      for(j=1;j<=5;j++) 
      { 
        
        System.out.print(" "+ch++ ); 
      } 
      System.out.println();
    } 
    }
  }