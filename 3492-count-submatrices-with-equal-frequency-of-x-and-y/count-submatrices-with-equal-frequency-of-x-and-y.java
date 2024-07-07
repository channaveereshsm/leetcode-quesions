class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int x[][]=new int[grid.length+1][grid[0].length+1];
        int y[][]=new int[grid.length+1][grid[0].length+1];
           int ans=0;
          
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
            int d=x[i][j+1]+x[i+1][j]-2*x[i][j];
            int d1=y[i][j+1]+y[i+1][j]-2*y[i][j];
                if(grid[i][j]=='X')
                {
                    
                    x[i+1][j+1]=d+1+x[i][j];
                }
                else
                {
                     x[i+1][j+1]=d+x[i][j];
                }
                if(grid[i][j]=='Y')
                {
                    
                    y[i+1][j+1]=d1+1+y[i][j];
                }
                else
                {
                    y[i+1][j+1]=d1+y[i][j];
                }
               
                if(x[i+1][j+1]>0 && x[i+1][j+1]==y[i+1][j+1])
                          ans++;
            }
                
        }
        return ans;
    }
}