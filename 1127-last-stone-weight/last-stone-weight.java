class Solution {
    public int lastStoneWeight(int[] s) {
       PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<s.length;i++)
        {
            p.offer(s[i]);
        }
       while(p.size()>1)
       {
         int x=p.poll();
           int y=p.poll();
           p.offer(x-y);
       }
        if(p.size()==0)
            return 0;
        return p.peek();
    }
}