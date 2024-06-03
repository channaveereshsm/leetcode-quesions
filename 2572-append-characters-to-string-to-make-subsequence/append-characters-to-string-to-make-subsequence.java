class Solution {
    public int appendCharacters(String s, String t) {
        
        int i=0,n=s.length(),m=t.length();
        for(int j=0;j<n;j++)
        {
            if(i==m)
                return 0;
            if(s.charAt(j)==t.charAt(i))
            {
                i++;
            }
        }
        return m-i;
    }
}