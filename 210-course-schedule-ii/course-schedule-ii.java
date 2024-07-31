class Solution {
    List<Integer> ans=new ArrayList<>();
    public boolean dfs(List<List<Integer>> l,int[] vis,int p)
    {
        if(vis[p]==1)
        return false;
        if(vis[p]==2)
        return true;
        vis[p]=1;
        for(int i=0;i<l.get(p).size();i++)
        {
            if(!dfs(l,vis,l.get(p).get(i)))
            return false;
        }
        vis[p]=2;
        ans.add(p);
        return true;
    }
    public int[] findOrder(int n, int[][] p) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        l.add(new ArrayList<>());

        for(int i=0;i<p.length;i++)
        {
            l.get(p[i][0]).add(p[i][1]);
        }
        int vis[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
              {  boolean x=dfs(l,vis,i);
                if(!x)
                return new int[0];
              }
            
        }
        int ans1[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
         ans1[i]=ans.get(i);
       // System.out.println(ans);
        return ans1;
    }
}