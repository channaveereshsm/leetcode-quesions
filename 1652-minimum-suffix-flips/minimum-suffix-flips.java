class Solution {
    public int minFlips(String target) {
        int c=0;
        for(int i=0;i<target.length();i++)
        {
            int x=target.charAt(i)-'0';
            if(x==c%2)
            {
                continue;
            }
            c++;

        }
        return c;
    }
}