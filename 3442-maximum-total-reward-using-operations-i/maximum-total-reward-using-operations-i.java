class Solution {
    public int find(int[] r,int i,int sum,int[][] dp)
    {
        if(i==r.length)
        {
            return sum;
        }
        if(dp[i][sum]!=0)
            return dp[i][sum];
        int max=0;
        if(sum<r[i])
        {
          return dp[i][sum]=Math.max(find(r,i+1,sum+r[i],dp),find(r,i+1,sum,dp));  
        }
        
        return dp[i][sum]=find(r,i+1,sum,dp);
    }
    public int maxTotalReward(int[] r) {
        int dp[][]=new int[r.length+1][4000];
        Arrays.sort(r);
        return find(r,0,0,dp);
    }
}