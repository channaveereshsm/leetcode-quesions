class Solution {
    public int passThePillow(int n, int time) {
        n=n-1;
        time=time%(2*n);
        if(time>=n)
        {
            return n-(time)%n+1;
        }
        else
        return time+1;
    }
}