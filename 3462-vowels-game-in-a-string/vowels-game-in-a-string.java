class Solution {
    public boolean doesAliceWin(String s) {
        int c=0;

        for(int i=0;i<s.length();i++)
        {
            char v=s.charAt(i);
            if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
           {
            c++;
           }

        }
        if(c==0)
        return false;
        
        return true;
    
    }
}