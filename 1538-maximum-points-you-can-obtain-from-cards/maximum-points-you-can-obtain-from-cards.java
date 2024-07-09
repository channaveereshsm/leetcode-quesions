class Solution {
    public int maxScore(int[] nums, int k) {
        int max=0,sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        max=sum;
        int j=nums.length-1;
        for(int i=k-1;i>=0;i--)
        {
            sum=sum-nums[i]+nums[j--];
            max=Math.max(max,sum);
        }
        return max;
    }
}