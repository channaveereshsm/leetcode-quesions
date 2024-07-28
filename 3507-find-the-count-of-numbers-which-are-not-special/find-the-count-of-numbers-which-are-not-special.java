class Solution {
    public int nonSpecialCount(int l, int r) {
        int x=(int)Math.sqrt(r)+1;
        int dp[]=new int[x+2];
        dp[1]=0;
        dp[2]=0;
        for(int i=2;i<=x;i++)
        {
             for(int j=i*i;j<=x;j=j+i)
             {
                dp[j]=1;
             }
        }
        int c=0;
        for(int i=2;i<=x;i++)
        {
            int y=i*i;
            if(y>=l&&y<=r && dp[i]==0)
            {
                c++;
            }
        }

        return r-l+1-c;
    }
}