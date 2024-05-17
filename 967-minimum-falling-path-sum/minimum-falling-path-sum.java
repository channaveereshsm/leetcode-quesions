class Solution {
    public int minFallingPathSum(int[][] m) {
        int d[]={-1,0,1};
        for(int i=1;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                int min=Integer.MAX_VALUE;
                for(int k=0;k<3;k++)
                {
                    int x=j+d[k];
                   
                    if(x>=0&&x<m[0].length)
                    {
                        min=Math.min(min,m[i][j]+m[i-1][x]);
                    }
                    
                }
                m[i][j]=min;
            }
        }
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<m[0].length;i++)
            min=Math.min(m[m.length-1][i],min);
        
        return min;
        
    }
}