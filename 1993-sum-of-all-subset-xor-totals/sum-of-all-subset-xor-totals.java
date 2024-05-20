class Solution {
    int ans=0;
    public void find(int[] nums,int i,int xor)
    {
      
        if(i==nums.length)
        {
            ans=ans+xor;
            return;
        }
        find(nums,i+1,xor^nums[i]);
        find(nums,i+1,xor);
    }
    
    public int subsetXORSum(int[] nums) {
        find(nums,0,0);
        return ans;
    }
}