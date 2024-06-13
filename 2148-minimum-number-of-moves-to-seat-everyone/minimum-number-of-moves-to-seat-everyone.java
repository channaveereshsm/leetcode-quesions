class Solution {
    public int minMovesToSeat(int[] s, int[] s1) {
        Arrays.sort(s);
        Arrays.sort(s1);
        int ans=0;
        for(int i=0;i<s.length;i++)
        {
             ans=ans+Math.abs(s[i]-s1[i]);
        }
        return ans;
    }
}