class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        { nums[i]=nums[i]%k;
         if(nums[i]==0)
             nums[i]=k;
        }
        
        int l=0;
        HashMap<Long,Integer> m=new HashMap<>();
        long a[]=new long[nums.length+1];
        m.put((long)0,-1);
        for(int i=0;i<nums.length;i++)
        {
            a[i+1]=(a[i]+nums[i])%k;
            
            if(!m.containsKey(a[i+1]))
            {
                m.put(a[i+1],i);
            }
            else
            {
                if(i-m.get(a[i+1])>=2)
                     return true;
            }
            
        }
       
        return false;
    }
}