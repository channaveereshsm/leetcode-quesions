class Solution {
    List<String> l=new ArrayList<>();
    public void find(int n,String s,int f)
    {
        if(n==0)
        {
            l.add(s);
            return ;
        }
        if(f==0)
        {
            s=s+"0";
            find(n-1,s,1);
            s=s.substring(0,s.length()-1);
        }
        s=s+"1";
        find(n-1,s,0);
         s=s.substring(0,s.length()-1);

    }
    public List<String> validStrings(int n) {
        find(n,"",0);
        return l;
    }
}