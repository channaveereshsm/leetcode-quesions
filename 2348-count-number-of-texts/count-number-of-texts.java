class Solution {
    public int countTexts(String p) {
        long dp[]=new long[p.length()+1];
        long ans=1;
        int nums[]=new int[10];
        Arrays.fill(nums,3);
        nums[7]=4;
        nums[9]=4;
        int i=0;
        while(i<p.length())
        {
            char c=p.charAt(i);
            int count=0;
            List<Long> l=new ArrayList<>();
            while(i<p.length()&&c==p.charAt(i))
            { count++;
                i++;
            }
            l.add(1L);
            int pre=nums[c-'0'];
            
            for(int j=1;j<=count;j++)
            {
                int x=Math.max(0,j-pre);
                 long sum=0;
                 
                for(int k=j-1;x<=k;k--)
                {
                   sum=sum+l.get(k);
                   sum=sum%1000000007;
                }
                l.add(sum%1000000007);
                

            }

            ans=ans*l.get(l.size()-1);
            ans=ans%1000000007;

        }
        return (int)ans%1000000007;
    }
}
