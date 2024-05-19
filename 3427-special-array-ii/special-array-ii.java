class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] q) {
        int a[]=new int[nums.length];
        int c=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]%2==nums[i-1]%2)
            {
                c++;
                a[i]=c;
            }
            else
                a[i]=c;
        }
        boolean ans[]=new boolean[q.length];
        for(int i=0;i<q.length;i++)
        {
            if(q[i][1]==q[i][0])
            { ans[i]=true;
             continue;
            }
            if(a[q[i][1]]-a[q[i][0]]==0)
            {
                ans[i]=true;
            }
            else
                ans[i]=false;
        }
      
        
      return ans; 
        
    }
}