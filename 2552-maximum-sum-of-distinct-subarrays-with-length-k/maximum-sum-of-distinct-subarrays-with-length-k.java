class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0;
         long dp[]=new long[nums.length+1];
        int j=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            dp[i+1]=dp[i]+nums[i];
            if(!m.containsKey(nums[i]))
            {
                m.put(nums[i],i);
            }
            else
            {
                j=Math.max(j,m.get(nums[i])+1);
                m.replace(nums[i],i);
                
            }
            if(i+1-j>=k)
            {
                max=Math.max(dp[i+1]-dp[i-k+1],max);
            }
        }
        return max;
    }
}