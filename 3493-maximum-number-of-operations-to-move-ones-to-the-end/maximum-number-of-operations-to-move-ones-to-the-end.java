class Solution {
    public int maxOperations(String s) {
        int c=0,sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                c++;
                
            }
            else
            {
                
                sum=sum+c;
                while(i<s.length() && s.charAt(i)=='0')
                {
                    i++;
                }
                i--;
                
            }
        }
        return sum;
    }
}