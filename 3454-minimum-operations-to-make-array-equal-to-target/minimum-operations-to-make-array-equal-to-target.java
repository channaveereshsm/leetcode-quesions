class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        int dp[]=new int[target.length];
        long ans=0;
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=target[i]-nums[i];
        }
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(dp[i]>0)
            {
              if(dp[i]>max)
              {
                max=dp[i];
              }
              else
              {
                ans=ans+max-dp[i];
                max=dp[i];
              }
            }
            else
           { ans=ans+max;
            max=0;
           }
            if(i==dp.length-1)
             ans=ans+max;

            

        }
        max=0;
         for(int i=0;i<nums.length;i++)
        {
            if(dp[i]<0)
            {
              if(dp[i]<max)
              {
                max=dp[i];
              }
              else
              {
                ans=ans-max+dp[i];
                max=dp[i];
              }
            }
            else{
                ans=ans-max;
            max=0;
            }
            if(i==dp.length-1 )
             ans=ans-max;

        }
        return ans;
    }
}