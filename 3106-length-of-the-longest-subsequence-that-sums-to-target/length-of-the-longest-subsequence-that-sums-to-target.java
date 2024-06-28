class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int t) {
    
     int dp[]=new int[t+1];
     int sum=0;
     for(int i=0;i<nums.size();i++)
     {
        int  x=nums.get(i);
        int a[]=new int[t+1];
        sum=sum+x;
        if(x<=t)
        {
            
            for(int j=x;j<=Math.min(sum,t);j++)
            {
                if(dp[j-x]!=0||j==x)
                  a[j]=Math.max(dp[j],dp[j-x]+1);
            }
           for(int k=x;k<=Math.min(sum,t);k++)
             dp[k]=Math.max(a[k],dp[k]);

            
        }
        
        

        
     }

    
     if(dp[t]==0)
     return -1;
     return dp[t];

    }
}