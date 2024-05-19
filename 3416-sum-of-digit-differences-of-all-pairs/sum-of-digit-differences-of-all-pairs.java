class Solution {
    public long sumDigitDifferences(int[] nums) {
        long ans=0;

        
     while(nums[0]!=0){
         int d[]=new int[10];
        for(int i=0;i<nums.length;i++)
        {
        int r=nums[i]%10;
            d[r]=d[r]+1;
            nums[i]=nums[i]/10;
            
        }
         long f=0,count=0;
         for(int i=0;i<10;i++)
         {
             count=count+d[i]; 
         }
         for(int i=0;i<10;i++)
         {
             long c=0;
             c=(count-d[i])*d[i];  
             
            ans=ans+c;
         }
        
     }
        
        return ans/2;
    }
}