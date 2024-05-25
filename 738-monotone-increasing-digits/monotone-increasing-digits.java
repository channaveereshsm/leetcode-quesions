class Solution {
    public int monotoneIncreasingDigits(int n) {
        int d[]=new int[10];
        int k=9,n1=n;
        while(n>0)
        {
         d[k]=n%10;
            n=n/10;
            k--;
        }
        n=100000000;
        k=9;
        while(k-->0){
        for(int i=0;i<9;i++)
        {
            if(d[i]>d[i+1])
            { 
                d[i]--;
                for(int j=i+1;j<=9;j++)
            {
                d[j]=9;
            }
            }
        
        }
                 n=0;
        for(int m=0;m<=9;m++)
        {
           n=n*10+d[m]; 
        }
        }
        
        
        return n;
        
    }
}