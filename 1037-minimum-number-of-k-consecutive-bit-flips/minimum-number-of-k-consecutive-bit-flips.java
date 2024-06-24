class Solution {
    public int minKBitFlips(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int x=0,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(i))
            {
                x=x-1;
            }
            if((nums[i]+x)%2==0)
            {
                nums[i]=1;
                x=x+1;
               
                ans=ans+1;
                if(i+k>nums.length)
                    return -1;
                m.put(i+k,1);
                
            }
            
        }
        return ans;
        
    }
}