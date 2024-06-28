class Solution {
    public long maximumImportance(int n, int[][] roads) {
        
        long a[]=new long[n];
        for(int i=0;i<roads.length;i++)
        {
            a[roads[i][0]]+=1;
            a[roads[i][1]]+=1;
        }
        Arrays.sort(a);
        long ans=0;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]>0)
            {
             
                ans=ans+a[i]*(i+1);
            }
            else
            return ans;
        }
        return ans;
    }
}