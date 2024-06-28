class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[]=s.split(" ");
        HashMap<Character,String> m=new HashMap<>();
         HashMap<String,Character> m1=new HashMap<>();

        if(pattern.length()!=a.length)
        return false;
           for(int i=0;i<pattern.length();i++)
           {
               if(!m.containsKey(pattern.charAt(i)))
               {
                 if(m1.containsKey(a[i]))
                 return false;
                 else
                 {
                    m.put(pattern.charAt(i),a[i]);
                     m1.put(a[i],pattern.charAt(i));
                 }
               }
               else
               {
                 String s1=m.get(pattern.charAt(i));
                 if(!s1.equals(a[i]))
                 return false;}
           }
    
        return true;
        
    }
}