class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        long pre=0,min=100000000,p=0,n=nums.length-1;
        for(int i=0;i<nums.length-1;i++)
        {
            pre=pre+nums[i];
            long x=pre/(i+1);
            long y=(sum-pre)/(n-i);
            long ans=x-y;
           // System.out.println(ans);
            if(ans<0)
             ans=-ans;
             if(ans<min)
             {
             min=ans;
             p=i;
             }
        }
        long z=sum/(n+1);
        if(z<min)
         return nums.length-1;
        return (int)p;
    }
}