class Solution {
    public boolean valid(int[][] grid)
    {
        for(int i=0;i<3;i++)
          for(int j=0;j<3;j++)
           if(grid[i][j]!=1)
            return false;


            return true;
    }
    public int minimumMoves(int[][] grid) {
       return find(grid);
    }
    public int find(int[][] grid)
    {
         int ans=1000000;
         if(valid(grid))
          return 0;
       for(int i=0;i<3;i++)
       {
        for(int j=0;j<3;j++)
        {
            if(grid[i][j]==0)
            {
            
                grid[i][j]=1;
                for(int k=0;k<3;k++)
                  {
                    for(int l=0;l<3;l++)
                    {
                        if(grid[k][l]>1)
                        {
                            grid[k][l]-=1;
                           ans=Math.min(ans,Math.abs(i-k)+Math.abs(j-l)+find(grid));
                            grid[k][l]+=1;
                        }
                        
                    }
                  }
                  grid[i][j]=0;
                
            }
        }
       }
       return ans;

    }
       
    
}
