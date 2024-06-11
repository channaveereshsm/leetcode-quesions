class Solution {
    public int find(int[] nums,int i,int pre,Integer[][][] dp,int k)
    {
        if(i==nums.length)
        {
            return dp[i][k][pre+1]=0;
        }
        if(dp[i][k][pre+1]!=null)
            return dp[i][k][pre+1];
        int take=0;
        if(pre==-1||nums[i]==nums[pre])
        {
            take=1+find(nums,i+1,i,dp,k);
        }
        else if(k>0)
        {
            take=1+find(nums,i+1,i,dp,k-1);
        }
        
        int ntake=find(nums,i+1,pre,dp,k);
        return dp[i][k][pre+1]=Math.max(take,ntake);
    }
    
    public int maximumLength(int[] nums, int k) {
       Integer [][][] dp=new Integer[nums.length+1][k+1][nums.length+1];
        int ans=find(nums,0,-1,dp,k);
        return ans;
    }
}
