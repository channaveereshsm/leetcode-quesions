class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
    int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int i=0,j=0,max=0,d=0;
        while(i<s.length())
        {  d=d+a[i];
            i++;
          while(d>maxCost)
          {
              d=d-a[j];
              j++;
          }
         max=Math.max(i-j,max);
        }
        return max;
    }
}