class Solution {
    public int reachNumber(int target) {
        int sum=0,i=1;
        target=Math.abs(target);
        while(sum<target)
        {
            sum=sum+i;
            i++;
        }
        
         while((sum-target)%2!=0)
         {
             int x=sum-target;
              sum=sum-2*x;
             sum=sum+i;
             i++;
         }
        
        return i-1;
    }
}