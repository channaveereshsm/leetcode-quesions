class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        
        int max=1,ans=0,need=nums[0];
        for(int i=0;i<nums.length;i++)
        {
          ans=ans+Math.max(need-nums[i],0);
           need=Math.max(need,nums[i])+1; 
        }
        return ans;
    }
}