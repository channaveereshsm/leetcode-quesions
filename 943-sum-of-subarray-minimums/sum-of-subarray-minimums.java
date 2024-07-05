class Solution {
    public int sumSubarrayMins(int[] arr) {
        int dp[]=new int[arr.length+1];
        int mod=1000000007;
        int ans=0;
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        for(int i=0;i<arr.length;i++)
        {
            while(s.peek()!=-1 && arr[i]<arr[s.peek()])
            {
                s.pop();
            }
            dp[i+1]=(dp[s.peek()+1]+(i-s.peek())*arr[i])%mod;
            s.push(i);
            ans=(ans+dp[i+1])%mod;
        }
        return ans;
        
    }
}