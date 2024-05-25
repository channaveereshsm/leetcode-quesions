class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0,s=nums.length;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                int x=nums.length-1;
                while(x>j && nums[j]+nums[i]<=nums[x])
                {
                  x--;
                    c++;
                }
                
            }
        }
       
        int result=(s*(s-1)*(s-2))/6;
        return result-c;
    }
}