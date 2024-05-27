class Solution {
    public int specialArray(int[] nums) {
        int a[]=new int[1001];
        for(int i=0;i<nums.length;i++)
        {
           a[nums[i]]+=1; 
        }
        int c=0;
        
        for(int i=1000;i>=1;i--)
        {
            c=c+a[i];
            if(c==i)
                return i;
        }
        
        
        return -1;
    }
}