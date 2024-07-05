class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        long dp[]=new long[high+1];
        dp[0]=1;
        for(int i=1;i<=high;i++)
        {
            if(i-zero>=0)
            {
                dp[i]=dp[i]+dp[i-zero];
            }
            dp[i]=dp[i]%1000000007;
             if(i-one>=0)
            {
                dp[i]=dp[i]+dp[i-one];
            }
            dp[i]=dp[i]%1000000007;
            
        }
        long ans=0;
        for(int i=low;i<=high;i++)
        {
            ans=ans+dp[i];
            ans=ans%1000000007;
        }

        return (int)ans;
    }
}