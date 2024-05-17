class Solution {
    int ans=0;
    public int maxDistance(int[][] grid) {
        Queue<Integer> qx=new LinkedList<>();
        Queue<Integer> qy=new LinkedList<>();
        int dp[][]=new int[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
              if(grid[i][j]==1)
              {
                  grid[i][j]=0;
                  dp[i][j]=1;
                  qx.add(i);
                  qy.add(j);
              }
            }
        }
        if(qx.size()==grid.length*grid[0].length)
            return -1;
        if(qx.size()==0)
            return -1;
        int d[][]={{-1,0},{0,-1},{1,0},{0,1}};
         
        while(qx.size()!=0)
        {
            ans=ans+1;
            int size=qx.size();
            for(int i=0;i<size;i++)
            {
                int x=qx.poll();
                int y=qy.poll();
                for(int j=0;j<4;j++)
                {
                    int x1=x+d[j][0];
                    int y1=y+d[j][1];
                    if(x1<0||y1<0||x1>dp.length-1||y1>dp[0].length-1||dp[x1][y1]==1)
                        continue;
                    dp[x1][y1]=1;
                    grid[x1][y1]=ans;
                    
                    qx.add(x1);
                    qy.add(y1);
                }
            }
            
        }
        
            
        
        return ans-1;
    }
}