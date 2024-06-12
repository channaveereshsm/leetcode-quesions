class Solution {
    int dp[][]=new int[204][204];
    
    public int dfs(int i,int j,List<Integer> l)
    {
        if(i>=j-1)
        {
            return 0;
        }
        if(dp[i][j]!=Integer.MAX_VALUE)
            return dp[i][j];
        for(int k=i+1;k<j;k++)
        {
            dp[i][j]=Math.min(dp[i][j],l.get(j)-l.get(i)+dfs(i,k,l)+dfs(k,j,l));
        }
        return dp[i][j];
    }
    public int minCost(int n, int[] cuts) {
        List<Integer> l=new ArrayList<>();
        l.add(n);
        l.add(0);
        for(int i=0;i<cuts.length;i++)
        {
            l.add(cuts[i]);
        }
        for(int i=0;i<204;i++)
        {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        Collections.sort(l);
        
       int ans=dfs(0,l.size()-1,l);
        
    return ans;
    }
}