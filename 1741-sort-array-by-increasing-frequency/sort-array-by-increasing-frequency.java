class Solution {
    public int[] frequencySort(int[] nums) {
        int a[]=new int[202];
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]+100]+=1;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<201;i++)
        {
            if(a[i]>0)
            {
                l.add(a[i]);
            }
        }
        Collections.sort(l);
        int p=0;
        for(int i=0;i<l.size();i++)
        {
            int x=l.get(i);
            for(int j=201;j>-1;j--)
            {
                if(x==a[j])
                {
                    while(x>0)
                    {
                        nums[p++]=j-100;
                        x--;
                    }
                    a[j]=0;
                }

            }
        }
       return nums;

    }
}