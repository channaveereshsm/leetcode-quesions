class Solution {
    public int maximumProduct(int[] nums, int k) {
       PriorityQueue<Integer> q=new PriorityQueue();
       for(int i=0;i<nums.length;i++)
       {
           q.add(nums[i]);
       }
      while(k>0)
      {
          int x=q.poll();
          x=x+1;
          k=k-1;
          q.add(x);
      }
        int mod=1000000007;
        long ans=1;
        while(q.size()>0)
        {
            ans=(ans*q.poll())%mod;
            ans=ans%mod;
        }
        return (int)ans%mod;
    }
}