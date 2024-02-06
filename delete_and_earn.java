https://leetcode.com/submissions/detail/1167659622/
class Solution {
    public int deleteAndEarn(int[] nums) {
       Arrays.sort(nums);
        HashMap<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
           if(!m.containsKey(nums[i]))
           {
               m.put(nums[i],1);
               l.add(nums[i]);
           }
           else
           {
               m.replace(nums[i],m.get(nums[i])+1);
           }
        }
        int dp[]=new int[l.size()+1];
        dp[0]=0;
        dp[1]=l.get(0)*m.get(l.get(0));

        for(int i=1;i<l.size();i++)
        {
            if(l.get(i)!=l.get(i-1)+1)
            {
                dp[i+1]=dp[i]+l.get(i)*m.get(l.get(i));
            }
            else
            {
              dp[i+1]=Math.max(dp[i],dp[i-1]+l.get(i)*m.get(l.get(i)));
               
            }
        }
        return dp[dp.length-1];
    }
}
