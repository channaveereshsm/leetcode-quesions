class Solution {
    HashMap<Long,Integer> m=new HashMap<>();
    public int find(long n)
    {
        if(n==1)
        return 0;
       
        if(m.containsKey(n))
        return m.get(n);
        int a=Integer.MAX_VALUE;
        if(n%2==0)
        {
          a=Math.min(a,1+find(n/2));
        }
        else
        a=Math.min(1+find(n-1),1+find(n+1));
        m.put(n,a);
        return m.get(n);
    }
    public int integerReplacement(int n) {
        long y=1;
        for(int i=1;i<31;i++)
        {m.put(y,i);
        y=y*2;
        }

        return Math.max(find(n)-1,0);
    }
}