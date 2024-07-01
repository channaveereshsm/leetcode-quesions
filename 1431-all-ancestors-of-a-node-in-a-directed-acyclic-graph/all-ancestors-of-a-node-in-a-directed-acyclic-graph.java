class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> l=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            l.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            l.get(edges[i][0]).add(edges[i][1]);
        }
        for(int i=0;i<n;i++)
        {
            
            dfs(l,ans,i,i,new boolean[n]);
        }

return ans;
        
    }

    public void dfs(List<List<Integer>> l,List<List<Integer>> ans,int p,int x ,boolean[] vis)
    {
        vis[p]=true;

       for(int i=0;i<l.get(p).size();i++)
       {
         if(!vis[l.get(p).get(i)])
        {ans.get(l.get(p).get(i)).add(x);
        dfs(l,ans,l.get(p).get(i),x,vis);}
       }
    }
}