class Solution {
    int ans=0;
    public void find(int[] nums,int t,int i,int sum)
    {
        if(sum==t)
        {ans++;  
        }
        if(i>nums.length-1)
            return;
        
        
        if(sum+nums[i]<=t)
        {
            find(nums,t,i+1,sum+nums[i]);
            find(nums,t,i+1,sum);
        }
        
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int sumt=(sum+target)/2;
        if(sumt==0)
        { int dp[]=new int[sumt+1];
        dp[0]=1;
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<nums.length;j++)
                if(i-nums[j]>=0)
                    dp[i]+=dp[i-nums[j]];
            return dp[dp.length-1];
        }}
        if(sum<Math.abs(target))
            return 0;
        if((sum+target)%2!=0)
            return 0;
        find(nums,(sum+target)/2,0,0);
        
        return ans;
        
    }
}