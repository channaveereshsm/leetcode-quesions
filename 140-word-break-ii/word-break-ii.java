class Solution {
     HashSet<String> m=new HashSet<>();
    List<String> l=new ArrayList<>();
    public void find(String s,int i,String s1)
    {
        if(s.length()==0)
        {
         
            l.add(new String(s1.substring(1)));
            return;
        }
        
        for(int j=1;j<=s.length();j++)
        {
            String s2=s.substring(0,j);
            if(!m.contains(s2))
                continue;
            find(s.substring(j,s.length()),j,s1+" "+s2);
}
    }
    public List<String> wordBreak(String s, List<String> w) {
        for(int i=0;i<w.size();i++)
        {
            m.add(w.get(i));
        }
        String s1="";
        find(s,0,s1);
        return l;
    }
}