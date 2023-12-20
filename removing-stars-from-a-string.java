https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String removeStars(String s) {
        int c=0;
        StringBuilder b=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='*')
               {c=c+1;
               continue;}
             else
             {  if(c==0)
                {
                     b.append(s.charAt(i));

                }
                else
                  c--;
                 
             } 
             
        }
        b=b.reverse();
        return b.toString();
    }
}
