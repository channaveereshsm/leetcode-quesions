class Solution {
    public int minOperations(String[] logs) {
        int x=0;
        for(int i=0;i<logs.length;i++)
        {
            if(logs[i].charAt(1)=='.' && logs[i].charAt(0)=='.')
            {
                x--;
                x=Math.max(x,0);
            }
            if(logs[i].charAt(0)!='.')
            {
              x++;
            }
        }
        return Math.max(x,0);
    }
}