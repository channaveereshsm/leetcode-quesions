class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,-1);
        int ans=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==0)
           nums[i]=-1;
             sum=sum+nums[i]; 
              if(!m.containsKey(sum))
              {
              m.put(sum,i);
              }
              else
              {
             ans=Math.max(ans,i-m.get(sum));
              }
        }
        return ans;
    }
}