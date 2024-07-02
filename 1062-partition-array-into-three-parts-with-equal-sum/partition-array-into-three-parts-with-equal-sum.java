class Solution {
    public boolean canThreePartsEqualSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
         {
            sum=sum+nums[i];
         }
         if(sum%3!=0)
         return false;
         int x=0,y=sum/3,c=0;
         
         for(int i=0;i<nums.length;i++)
         {
            x=x+nums[i];
            if(x==y)
            {

                c++;
                x=0;
            }
            
         }
         if(c>=3)
         return true;
         else
         return false;
    }
}