class Solution {
    public int heightChecker(int[] h) {
        List<Integer> l=new ArrayList<>();
        int c=0;
        for(int i=0;i<h.length;i++)
        {
            l.add(h[i]);
        }
        Arrays.sort(h);
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)!=h[i])
            {
                c++;
            }
        }
        return c;
    }
}