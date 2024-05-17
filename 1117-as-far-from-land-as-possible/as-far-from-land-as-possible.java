class Solution {
    public int maxDistance(int[][] grid) {
        List<Integer> lx=new ArrayList<>();
        List<Integer> ly=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    lx.add(i);
                    ly.add(j);
                }
            }
        }
        int max=-1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(grid[i][j]==0)
                {
                    int min=1000000;
                    for(int k=0;k<lx.size();k++)
                    {
                      min=Math.min(min,Math.abs(lx.get(k)-i)+Math.abs(ly.get(k)-j)); 
                        if(min==1)
                            break;
                    }
                    if(min!=1000000)
                    {
                        max=Math.max(max,min);
                    }
                }
            }
        }
        return max;
    }
}