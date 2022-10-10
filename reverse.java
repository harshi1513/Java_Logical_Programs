class reverse
  {
    public static void main(String args[])
    {
      String st="hi how are you";
      int n=st.length();
      char a[]=st.toCharArray();
      String txt[]=st.split(" ");
      for(int i=n;i>0;i--)
        {
          System.out.println(st.charAt(i-1));
        }
    }
  }