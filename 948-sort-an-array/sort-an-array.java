class Solution {
    public void merg(int[] nums,int l,int mid,int r)
    {
        int i=l,j=mid;
        List<Integer> l1=new ArrayList<>();
        while(i<mid&&j<=r)
        {
            if(nums[i]<nums[j])
            {
                l1.add(nums[i]);
                i++;
            }
            else
            {
                l1.add(nums[j]);
                j++;
            }
        }

        while(i<mid)
        {
            l1.add(nums[i]);
            i++;
        }
        while(j<=r)
        {
            l1.add(nums[j]);
            j++;
        }
        int p=0;
        for(int k=l;k<=r;k++)
        {
        nums[k]=l1.get(p);
        p++;
        }
    }
    public void mergesort(int[] nums,int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergesort(nums,l,mid);
            mergesort(nums,mid+1,r);
            merg(nums,l,mid+1,r);

        }
    }
    public int[] sortArray(int[] nums) {
       mergesort(nums,0,nums.length-1); 
       return nums;
    }
}