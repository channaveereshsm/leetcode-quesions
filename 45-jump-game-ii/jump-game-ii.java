class Solution {
    public int jump(int[] nums) {
        int j=0,ans=0,max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(i>j)
            {
                j=max;
                ans++;
            }
            max=Math.max(max,nums[i]+i);


        }
        return ans;

    }
}