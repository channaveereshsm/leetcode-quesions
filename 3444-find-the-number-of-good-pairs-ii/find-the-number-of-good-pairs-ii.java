class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long ans=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(!m.containsKey(nums2[i]*k))
            {
                m.put(nums2[i]*k,1);
            }
            else
                m.replace(nums2[i]*k,m.get(nums2[i]*k)+1);
        }
        for(int i=0;i<nums1.length;i++)
        {
            int x=nums1[i];
            if(x%k!=0)
                continue;
            int sqrt=(int)Math.sqrt(x);
            for(int j=1;j<=sqrt;++j)
            {
                if(x%j!=0)
                    continue;
                if(m.containsKey(j))
                {
                    ans=ans+m.get(j);
                   
                }
                if(j!=x/j)
                {
                    if(m.containsKey(x/j))
                    {
                        ans=ans+m.get(x/j);
                    }
                }
            }
        }
      return ans;      
    }
}