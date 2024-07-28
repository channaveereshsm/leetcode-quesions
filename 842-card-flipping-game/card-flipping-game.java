class Solution {
    public int flipgame(int[] f, int[] b) {
        
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<f.length;i++)
        {
            
             if(f[i]==b[i])
             {
                m.add(f[i]);
                
             }
            

        }
        int ans=4000;
        for(int i=0;i<f.length;i++)
        {
            if(!m.contains(f[i]))
             ans=Math.min(ans,f[i]);
             if(!m.contains(b[i]))
             ans=Math.min(ans,b[i]);
        //     if(m.contains(f[i]))
        //    { 
        //     if(!m.contains(b[i]))
        //     ans=Math.min(ans,b[i]);

           
        //    }
        //    else if(!m.contains(b[i]))
        //    {
                
        //         ans=Math.min(ans,Math.min(b[i],f[i]));
        //    }
        }
        if(ans!=4000)
        return ans;
        return 0;

        
        
    }
}