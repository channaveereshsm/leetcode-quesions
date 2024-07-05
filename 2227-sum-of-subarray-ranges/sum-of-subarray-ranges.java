class Solution {
    public long subArrayRanges(int[] nums) {
       long ans=0;
       int n=nums.length;
      
       for(int i=0;i<n;i++)
       {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int j=i;j<n;j++)
        {
            min=Math.min(min,nums[j]);
            max=Math.max(max,nums[j]);
           ans=ans+max-min;
        }
        
       }
       return ans;
    }
}