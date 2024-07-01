class Solution {
    public int maxScoreSightseeingPair(int[] v) {
        int x[]=new int[v.length];
        int y[]=new int[v.length];
        for(int i=0;i<v.length;i++)
        {
            x[i]=v[i]+i;
            y[i]=v[i]-i;
        }
        for(int i=1;i<v.length-1;i++)
        {
            x[i]=Math.max(x[i],x[i-1]);
            y[v.length-1-i]=Math.max(y[v.length-i], y[v.length-1-i]);
        }
        int max=-1000000;
        for(int i=0;i<v.length-1;i++)
        {
            max=Math.max(max,x[i]+y[i+1]);
        }
        return max;

    }
}