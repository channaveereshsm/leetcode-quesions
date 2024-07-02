class Solution {
    public int longestSubarray(int[] nums) {
        int j=0;
        int max=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
                   if(nums[i]==0)
                   {
                    k++;
                   }
                   while(k>1 && i>j)
                   {
                    if(nums[j]==0)
                     k--;
                     j++;
                   }
                   max=Math.max(max,i-j);

        }
        return max;
    }
}