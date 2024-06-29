class Solution {
    public int numTeams(int[] nums) {
      int max[]=new int[nums.length];
      int min[]=new int[nums.length];
      for(int i=0;i<nums.length;i++)
      {
        int mi=0,ma=0;
        for(int j=i+1;j<nums.length;j++)
         {
            if(nums[j]>nums[i])
            ma+=1;
            if(nums[j]<nums[i])
              mi+=1;
         }
         max[i]=ma;
         min[i]=mi;
      } 
      int ans=0;
      for(int i=0;i<nums.length;i++)
      {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[j]>nums[i])
            {
                ans=ans+max[j];
            }
            else
            {
                ans=ans+min[j];
            }
        }
      } 
      return ans;
    }
}