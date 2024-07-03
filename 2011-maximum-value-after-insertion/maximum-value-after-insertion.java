class Solution {
    public String maxValue(String n, int x) {
        if(n.charAt(0)=='-')
        {
            int p=-1,max=0;
            for(int i=1;i<n.length();i++)
            {
                int d=n.charAt(i)-'0';
                if(d>x)
                {
                  
                  p=i;
                  break;
                
                }
            }
            if(p!=-1)
             n=n.substring(0,p)+x+""+n.substring(p);
             else
              n=n+""+x;
        }
        else
        {
            int l=n.length(),f=0,max=9,p=-1;
            for(int i=0;i<l;i++)
            {
                int d=n.charAt(i)-'0';
                if(x>d )
                {
                    if(max>d && p==-1)
                    {
                        p=i;
                        max=d;
                    }
                    //  n=n.substring(0,i)+x+""+n.substring(i);
                    //  f=1;
                    //  break;
                }
            }
            if(p!=-1)
             n=n.substring(0,p)+x+""+n.substring(p);
             else
              n=n+""+x;
        }
        return n;
    }
}