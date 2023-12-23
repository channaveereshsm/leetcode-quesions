https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length-k;
        int sum=0;
        int dp[]=new int[nums.length+1];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            dp[i+1]=sum;
            if(i+1>=n)
              min=Math.min(min,dp[i+1]-dp[i+1-n]);
              
        }
         sum=sum-min;

        return sum;
        
        
    }
}
