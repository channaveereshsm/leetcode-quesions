class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int max=0,ans=0;
        for(int c:coins)
        {
            while(max<target && max+1<c)
            {
                ans++;
                max=2*max+1;
            }
            if(max>=target)
            return ans;
            max=max+c;

        }
        while(max<target)
        {
            ans++;
            max=max+max+1;
        }
        return ans;
        
    }
}