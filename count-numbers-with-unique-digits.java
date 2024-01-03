https://leetcode.com/problems/count-numbers-with-unique-digits/submissions/
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
         return 1;
         int dp[]=new int[10];
         dp[0]=1;
         for(int i=0;i<9;i++ )
         {
             dp[i+1]=9;
         }
         
         for(int i=1;i<=9;i++)
         {
             int x=9;
             int j=i;
             while(j>0)
             {
                 dp[i]=dp[i]*x;
                 x--;
                 j--;
             }
       }

       for(int i=1;i<=9;i++)
       {
           dp[i]=dp[i]+dp[i-1];
       }

       return dp[n-1]+9;

        
    }
}
