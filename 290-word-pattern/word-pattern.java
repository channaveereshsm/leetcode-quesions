class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[]=s.split(" ");
         HashMap<String,Character> m=new HashMap<>();

        if(pattern.length()!=a.length)
        return false;
        int b[]=new int[26];
           for(int i=0;i<a.length;i++)
           {
            if(!m.containsKey(a[i]))
            {
                if(b[pattern.charAt(i)-'a']==1)
                return false;
                  b[pattern.charAt(i)-'a']=1;
                m.put(a[i],pattern.charAt(i));
            }
            else
            {
                char c=m.get(a[i]);
                if(c!=pattern.charAt(i))
                return false;
            }

           }
    
        return true;
        
    }
}