class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int sum=0,ans=0;
        m.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
           sum=sum+nums[i];
           if(!m.containsKey(sum))
           {
            if(m.containsKey(sum-k))
           {
            ans=ans+m.get(sum-k);
           }
               m.put(sum,1);
              
            

           } 
           else
           {
            if(m.containsKey(sum-k))
           {
            ans=ans+m.get(sum-k);
           }
           
            m.put(sum,m.get(sum)+1);
           } 
            
           
           

        }

        return ans;

    }
}