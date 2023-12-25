https://leetcode.com/problems/decode-ways/


class Solution {
    public int numDecodings(String s) {
        int[] a=new int [s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=s.charAt(i)-'0';
        }
         if(a[0]==0)
         return 0;

         int dp[]=new int[s.length()+1];
         dp[0]=1;
         dp[1]=1;
         for(int i=1;i<a.length;i++)
         {  
            if(a[i]>=1&&a[i]<=9)
              {
                  dp[i+1]=dp[i];
              }
              if(a[i-1]*10+a[i]>9 && a[i-1]*10+a[i]<27)
                dp[i+1]+=dp[i-1];
             


         }
           
           return dp[s.length()];
                  }
}
