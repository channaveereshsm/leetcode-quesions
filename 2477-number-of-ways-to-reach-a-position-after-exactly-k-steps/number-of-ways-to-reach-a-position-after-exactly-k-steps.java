class Solution {
    public int numberOfWays(int startPos, int endPos, int k) {
        int l=Math.min(startPos,endPos);
        int r=Math.max(startPos,endPos);
        if(r-l>k)
            return 0;
        int x=r-l,mod=1000000007;
        if((k-(r-l))%2!=0)
            return 0;
        int y=(k-x)/2;
        y=y+x;
        x=(k-x)/2;
        
       int dp[][]=new int[k+1][k+1];
        for(int i=0;i<=k;i++)
        {
            for(int j=0;j<=Math.min(i,x);j++)
            {
                if(j==0)
                {
                    dp[i][j]=1;
                    continue;
                }
                if(i==j)
                {
                    dp[i][j]=1;
                }
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                    dp[i][j]=dp[i][j]%mod;
                }
            }
        }
        
        
        return dp[k][Math.min(x,y)];
    }
}