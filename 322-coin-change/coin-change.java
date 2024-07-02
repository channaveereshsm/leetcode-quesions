class Solution {
    public int coinChange(int[] c, int a) {
        Arrays.sort(c);
        int dp[]=new int[a+1];
        Arrays.fill(dp,100000);
        dp[0]=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]<=a)
            {
                for(int j=c[i];j<=a;j++)
                {
                    if(dp[j-c[i]]!=0 || j-c[i]==0)
                    {
                        dp[j]=Math.min(dp[j],dp[j-c[i]]+1);
                    }
                }
            }
        }
        if(dp[a]>=100000)
        return -1;
        return dp[a];

    }
}