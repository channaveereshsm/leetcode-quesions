https://leetcode.com/problems/minimum-time-to-make-rope-colorful/description/?envType=daily-question&envId=2023-12-27
class Solution {
    public int minCost(String c, int[] n) {
         int count=0,l=c.length(),f=0;
        for(int i=1;i<l;i++)
        {
            int sum=n[i-1];
            int max=n[i-1];
            while(i<l && c.charAt(i)==c.charAt(i-1))
            {
                sum=sum+n[i];
                max=Math.max(max,n[i]);
                i++;
                f=1;
            }
            if(f==1)
            count=count+sum-max;

        }
        return count;
    }
}
