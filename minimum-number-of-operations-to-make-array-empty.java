//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int i=0,y=0;
        while(i<nums.length)
        {
            int x=nums[i],c=0;
            while(i<nums.length)
            {
                if(x==nums[i])
                {
                    c++;
                    i++;
                }
                else
                {
                    break;
                }
            }
            if(c==1)
            {
                return -1;
            }
            else
            {
              if(c%3==0)
              {
                  y=y+c/3;
              }
              else 
              {
                  y=y+1+c/3;
              }
               }
        }

        return y;
        
    }
}
