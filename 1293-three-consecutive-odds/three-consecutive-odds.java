class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                x=x+1;
                if(x==3)
                return true;
            }
            else
            x=0;
        }
        return false;
    }
}