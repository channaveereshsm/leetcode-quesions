class Solution {
    public int maxSumDivThree(int[] nums) {

        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int sum=0,sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==0)
            {
                sum=sum+nums[i];
            }
            else if(nums[i]%3==1)
            {
              l1.add(nums[i]);
                 sum1=sum1+nums[i];
            }
            else
            {
                l2.add(nums[i]);
                 sum2=sum2+nums[i];
            }
            
        }
        Collections.sort(l1);
        Collections.sort(l2);
        sum1=sum1+sum2+sum;
        if(sum1%3==0)
        {
            return sum1;
        }
        int max=0,x=0;
        for(int i=0;i<Math.min(2,l1.size());i++)
        {
            x+=l1.get(i);
            if((sum1-x)%3==0)
            {
                max=Math.max(sum1-x,max);
            }
        }
        x=0;
         for(int i=0;i<Math.min(2,l2.size());i++)
        {
            x+=l2.get(i);
            if((sum1-x)%3==0)
            {
                max=Math.max(sum1-x,max);
            }
        }
        return max;
    
        
    }
}