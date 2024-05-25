class Solution {
    public boolean check(int[] nums) {
        int size=0;
        while(size<nums.length)
        {
            int x=nums.length,f=0;
            for(int i=0;i<x-1;i++)
            {
              if(nums[(i+size)%x]>nums[(i+size+1)%x])
                  f=1;
            }
            if(f==0)
                return true;
            size++;
        }
        return false;
    }
}