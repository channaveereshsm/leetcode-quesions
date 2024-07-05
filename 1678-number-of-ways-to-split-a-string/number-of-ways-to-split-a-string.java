class Solution {
    public int numWays(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                c++;
            }
        }

        if(c%3!=0)
        return 0;
        int x=c/3;
        if(x==0)
        {
            long ans=0,l=s.length();
            ans=(l-1)*(l-2)/2;
            ans= ans%1000000007;
            return (int)ans;
        }
        int c1=0,l1=0,l2=0;
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='1')
        {
            c1++;
        }
        if(c1==x)
        {
         l1++;
        }
        if(c1==2*x)
        {
            l2++;
        }
      }
    int ans=0;
      for(int i=0;i<l1;i++)
      {
     ans=ans+l2;
     ans=ans%1000000007;
      }
        return ans;
    }
}