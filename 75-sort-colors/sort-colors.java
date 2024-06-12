class Solution {
    public void sortColors(int[] nums) {
       int x=0,y=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                x++;
            }
            else if(nums[i]==1)
            {
               y++; 
            }
        }
       for(int i=0;i<nums.length;i++)
       {
           if(x>0)
           {
               nums[i]=0;
               x--;
           }
           else if(y>0)
           {
               nums[i]=1;
               y--;
           }
           else
               nums[i]=2;
               
       }
    }
}