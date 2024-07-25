class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Arrays.sort(days);
    
        int p=0;
        int dp[]=new int[366];
        for(int i=1;i<366;i++)
        {
            int min=Integer.MAX_VALUE;
            
            if(p==days.length)
           { dp[i]=dp[i-1];
           continue;
           }
            if(days[p]==i)
            {
                 min=Math.min(dp[i-1]+costs[0],min);
                    min=Math.min(dp[Math.max(0,i-7)]+costs[1],min);
                    min=Math.min(dp[Math.max(0,i-30)]+costs[2],min);
                    dp[i]=min;
                  p++;
            }
            else
            dp[i]=dp[i-1];
           
        }
        return dp[365];
    }
}