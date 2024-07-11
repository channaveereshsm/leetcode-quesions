class Solution {
    public int[] dailyTemperatures(int[] t) {
        List<Integer> l=new  ArrayList<>();
        List<Integer> p=new  ArrayList<>();
        int ans[]=new int[t.length];
        for(int i=0;i<t.length;i++)
        {
            if(l.size()==0)
            {
                l.add(t[i]);
                p.add(i);
                continue;
            }
            while(l.size()!=0&&l.get(l.size()-1)<t[i])
            {
                ans[p.get(p.size()-1)]=i-p.get(p.size()-1);
                p.remove(p.size()-1);
                l.remove(l.size()-1);
            }
            l.add(t[i]);
            p.add(i);
            
            
        }
        return ans;
        

    }
}