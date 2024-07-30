class Solution {
    public int minimumDeletions(String s) {
      int res=0,c=0;
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='b')
        {
            c++;
        }
        else if(c>0)
        {
          res++;
          c--;
        }
      }
    return res;
    }
}