//let {1,2,3,4,6}: But Actual size=6 since one missing.(Here 5 is missing). * Calculate Expected Total=> n(n+1)/2 = 6*7/2 = 21. * Actual total = 1+2+3+4+6= 16. * Missing num= ET-At= 21-16= 5.



class Missing
  {
    public static void main(String args[])
    {
      int i,n,sum=0,Sum;
      n=6;
      int a[]={1,2,3,5,6};
      Sum=n*(n+1)/2;
      for(i=0;i<n-1;i++)
        {
          sum=sum+a[i];
        }
      int miss_no=Sum-sum;
      System.out.println("the missing number is "+miss_no);
      
    }
  }