class Solution {
    public boolean validPalindrome(String s) {
        
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                int x=i+1;
                int y=j,f1=0,f2=0;
               while(x<y)
               {
                if(s.charAt(x)==s.charAt(y))
                {
                    x++;
                    y--;
                }
                else
                {
                  f1=1;
                  break;
                }
               }
               
               x=i;
               y=j-1;

               while(x<y)
               {
                if(s.charAt(x)==s.charAt(y))
                {
                    x++;
                    y--;
                }
                else
                {
                    f2=1;
                    break;
                }
               }
               if(f1==0||f2==0)
               return true;
               else
               return false;
            }
        }
        return true;
         
    }
}