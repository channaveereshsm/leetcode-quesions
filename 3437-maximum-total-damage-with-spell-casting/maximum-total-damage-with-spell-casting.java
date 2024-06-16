class Solution {
    public long maximumTotalDamage(int[] p) {
       Arrays.sort(p);
        HashMap<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<p.length;i++)
        {
            if(!m.containsKey(p[i]))
            {
                m.put(p[i],1);
                l.add(p[i]);
            }
            else
            {
                m.replace(p[i],m.get(p[i])+1);
            }
        }
        
        long dp[]=new long[l.size()+1];
       
         long x1=0;
        long sum=0,y=m.get(l.get(0));
            for(int k=0;k<y;k++)
            {
                sum=sum+l.get(0);
                if(x1<sum)
                    x1=sum;
            }
        dp[0]=x1;
        long max=dp[0];
        for(int i=1;i<l.size();i++)
        {
            
            long x=l.get(i)*m.get(l.get(i));
            
            
            dp[i]=x;
            
          for(int j=i-1;j>=Math.max(0,i-3);j--)
          {
              if(l.get(i)-l.get(j)>=3)
              {
                   dp[i]=Math.max(dp[i],x+dp[j]);
              }
              else
              {
                  dp[i]=Math.max(dp[j],dp[i]);
              }
          }
            
            if(dp[i]>max)
                max=dp[i];
        }
    
        return max;
        
    }
}