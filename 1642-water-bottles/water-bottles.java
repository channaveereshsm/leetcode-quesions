class Solution {
    public int numWaterBottles(int n, int n1) {
        int ans=n;
        while(n>=n1)
        {
            int r=n%n1;
            n=n/n1;
            ans=ans+n;
            n=n+r;

          
        }
        return ans;
    }
}