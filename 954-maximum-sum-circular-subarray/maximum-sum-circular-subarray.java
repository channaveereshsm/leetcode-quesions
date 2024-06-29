class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min=100000,cur_min=100000,cur_max=-100000,max=-100000,total=0;

        for(int i=0;i<nums.length;i++)
        {
            cur_min=Math.min(cur_min+nums[i],nums[i]);
            min=Math.min(min,cur_min);
            cur_max=Math.max(cur_max+nums[i],nums[i]);
            max=Math.max(cur_max,max);
            total+=nums[i];

        }
        if(total==min)
        return max;
        return Math.max(max,total-min);
    }
}