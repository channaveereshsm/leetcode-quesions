class Solution {
    public int countSeniors(String[] d) {
        int c=0;
        for(int i=0;i<d.length;i++)
        {
            if(((d[i].charAt(11)-'0')*10+d[i].charAt(12)-'0')>60)
            c++;
        }
        return c;
    }
}