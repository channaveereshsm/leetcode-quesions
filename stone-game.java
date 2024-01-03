//https://leetcode.com/problems/stone-game/description/
class Solution {

    public int find(int [] piles,int i,int j,int[][] dp)
    {
        if(i>j)
         return 0;
         int x;
         if(dp[i][j]!=0)
           return dp[i][j];
        
         dp[i][j]=Math.max(piles[i]+find(piles,i+1,j,dp),piles[j]+find(piles,i,j-1,dp));         return dp[i][j];
    }


    public boolean stoneGame(int[] piles) {
        int sum=0;
        int dp[][]=new int[piles.length][piles.length];
        for(int i=0;i<piles.length;i++)
        {
            sum=sum+piles[i];
        }
        int x=find(piles,0,piles.length-1,dp);
        if(x>sum-x)
         return true;
         else
         return false;
        
    }
}
