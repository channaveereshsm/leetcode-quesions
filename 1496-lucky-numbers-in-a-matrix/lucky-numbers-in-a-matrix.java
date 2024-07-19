class Solution {
    public List<Integer> luckyNumbers (int[][] m) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<m.length;k++)
                {
                    max=Math.max(m[k][j],max);
                }
                for(int k=0;k<m[0].length;k++)
                {
                    min=Math.min(m[i][k],min);
                }
                if(min==m[i][j]&& max==m[i][j])
                {
                    l.add(m[i][j]);
                }
            }
        }
        return l;
        
    }
}