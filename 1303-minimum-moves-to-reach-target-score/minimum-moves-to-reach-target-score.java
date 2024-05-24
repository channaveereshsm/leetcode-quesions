class Solution {
    public int minMoves(int target, int m) {
        
         int ans=0;
        while(m!=0 && target!=1)
        {
            ans++;
            if(target%2==0)
            {
                target=target/2;
                m--;
            }
            else
            {
                target--;
            }
        }
    
       return target-1+ans;

        
    }
}