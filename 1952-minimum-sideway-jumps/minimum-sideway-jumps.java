class Solution {
    public int minSideJumps(int[] o) {
        int dp[]=new int[3];
        dp[0]=1;
        dp[1]=0;
        dp[2]=1;
        for(int i=0;i<o.length;i++)
        {
            int x=o[i];
            if(x>0)
            {
                dp[x-1]=1000000;}
            
                for(int j=0;j<3;j++)
                {
                    if(x!=j+1)
                    {
                     dp[j]=Math.min(dp[j],Math.min(dp[(j+1)%3],dp[(j+2)%3])+1);    
                    }
                }
            
        }
        
        return Math.min(dp[0],Math.min(dp[1],dp[2]));
    }
}