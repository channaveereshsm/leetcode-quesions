class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<5)
        return 0;
        Arrays.sort(nums);
    int min=Integer.MAX_VALUE,n=nums.length;
        for(int i=0;i<=3;i++)
        {
            min=Math.min(nums[n-4+i]-nums[i],min);
        }
       
 return min;
    }
}