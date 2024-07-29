class Solution {
    public long salve(int[] nums,int i,int f,long[][] dp)
    {
        if(i==nums.length)
        return 0;
        if(dp[i][f]!=Integer.MIN_VALUE)
        return dp[i][f];
        long a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
        if(f==0)
        {
         a=-nums[i]+salve(nums,i+1,1,dp);
        }
        b=nums[i]+salve(nums,i+1,0,dp);
        if(a>b)
        {
            return dp[i][f]=a;
        }
        else
        return dp[i][f]=b;
    }
    public long maximumTotalCost(int[] nums) {
        long dp[][]=new long[nums.length+1][2];
        for(int i=0;i<nums.length;i++)
        {
            dp[i][0]=Integer.MIN_VALUE;
            dp[i][1]=Integer.MIN_VALUE;
        }
       return nums[0]+salve(nums,1,0,dp);
    }
}