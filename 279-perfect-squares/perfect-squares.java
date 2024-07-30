class Solution {
    public int find(int n,int dp[])
    {
        if(n<0)
        return 1000000;
        if(n<=3)
        return n;
        if(dp[n]!=Integer.MAX_VALUE)
        return dp[n];
        int a=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
        a=Math.min(a,1+find(n-i*i,dp));
        }
        return dp[n]=a;
    }
    public int numSquares(int n) {

        
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        return find(n,dp);
    }
}