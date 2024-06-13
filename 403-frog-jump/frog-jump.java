class Solution {
    Boolean dp[][];
    boolean vis[];
    Map<Integer,Integer> m;
    int n;
    public boolean dfs(int x,int k)
    {
        if(m.get(x)==n-1)
            return true;
        if(dp[m.get(x)][k]!=null)
            return dp[m.get(x)][k];
        vis[m.get(x)]=true;
        if(m.containsKey(x+k) && vis[m.get(x+k)]==false)
        {
            if(dfs(x+k,k))
                return true;
        }
        if(m.containsKey(x+k+1) && vis[m.get(x+k+1)]==false)
        {
            if(dfs(x+k+1,k+1))
                return true;
        }
        if(m.containsKey(x+k-1) && vis[m.get(x+k-1)]==false)
        {
            if(dfs(x+k-1,k-1))
                return true;
        }
        vis[m.get(x)]=false;
        return dp[m.get(x)][k]=false;
    }
    public boolean canCross(int[] stones) {
        n=stones.length;
        m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(stones[i],i);
        }
        dp=new Boolean[n][n];
        vis=new boolean[n];
        return dfs(0,0);
    }
}