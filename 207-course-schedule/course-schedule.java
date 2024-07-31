class Solution {
    

    public boolean dfs(List<List<Integer>> l,int[] vis,int p) {
        if(vis[p] == 1) 
            return false;
            if(vis[p]==2)
            return true;
        vis[p] = 1; 

        for(int i = 0; i < l.get(p).size(); i++) {
            if(!dfs(l,vis, l.get(p).get(i))) 
                return false;
        }
        vis[p] = 2; 
        return true;
    }

    public boolean canFinish(int n, int[][] p) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            l.add(new ArrayList<>()); 
        }

        for(int i = 0; i < p.length; i++) {
            l.get(p[i][0]).add(p[i][1]); 
        }
int vis[] = new int[n]; 
        for(int i = 0; i < n; i++) {
            if(vis[i] == 0 && l.get(i).size() != 0) {
                if(!dfs(l,vis,i)) 
                    return false;
            }
        }
        return true; 
    }
}
