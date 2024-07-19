class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> l=new ArrayList<>();
        long ans=0;
        if(finalSum%2==1)
        return l;
    
        for(long i=2;i<=finalSum;i=i+2)
        {
            ans=ans+i;
            
            if(ans>=finalSum)
            {
                break;
                
            }
            
        }
        long x=ans-finalSum;
        ans=0;
        for(long i=2;i<=finalSum;i=i+2)
        {
            if(x!=i)
            {
                ans=ans+i;
                l.add(i);
            }
            if(ans==finalSum)
            return l;
        }
        return l;
    }
}