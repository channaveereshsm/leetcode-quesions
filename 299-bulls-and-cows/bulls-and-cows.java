class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> m=new HashMap<>();
         int x=0;
        for(int i=0;i<secret.length();i++)
        {
            char c=secret.charAt(i);
            if(c==guess.charAt(i))
            {
              x++;
              continue;

            }
            if(!m.containsKey(c))
            {
                m.put(c,1);
            }
            else
            {
                m.replace(c,m.get(c)+1);
            }
        }
        //System.out.println(m);
       int y=0;
        for(int i=0;i<guess.length();i++)
        {
            char c=guess.charAt(i);
             if(c==secret.charAt(i))
            {
              
              continue;

            }
            if(m.containsKey(c) && m.get(c)>0)
            {
                y=y+1;
                m.replace(c,m.get(c)-1);
            }
            
            
        }
        String ans=x+""+'A'+y+'B';
        return ans;

    }
}