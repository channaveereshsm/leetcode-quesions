class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
          int max=0,r=0,flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(!m.containsKey(s.charAt(i)))
            {
                m.put(s.charAt(i),1);
            }
            else
            {
                m.replace(s.charAt(i),m.get(s.charAt(i))+1);
            }
        }
       
       for(char i:m.keySet())
       {  int x=m.get(i);
                 
           if(x%2==1)
            { flag=1;
            r=r+x-1;
           }
           else
           r=r+x;}
           if(flag==1)
             r=r+1;
        return r;
        
    }
}