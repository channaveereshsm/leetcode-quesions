class Solution {
    public long maxStrength(int[] nums) {
        long ans=1,max=-100000000;
        Arrays.sort(nums);
        long x=1;
        int f=0,y=1;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]<=0)
            {
                x=x*nums[i];
                if(x>max)
                  max=x;
                  y=0;

            }
            else
            {
                ans=ans*nums[i];
                f=1;
            }

        }
        if(y==1)
        return ans;
        if(max*ans>ans)
         ans=ans*max;
         if(f==1)
        return ans;
        else
        return max;
    }
}