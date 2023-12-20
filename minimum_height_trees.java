https://leetcode.com/problems/minimum-height-trees/

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1)
         {
            List<Integer> l=new ArrayList<>();
            l.add(0);
            return l;
         }

         HashMap<Integer,HashSet<Integer>> m=new HashMap<>();
         for(int i=0;i<edges.length;i++)
         { int l=edges[i][0];
           int k=edges[i][1];
             if(!m.containsKey(l))
              m.put(l,new HashSet<>());
              if(!m.containsKey(k))
              m.put(k,new HashSet<>());
              m.get(l).add(k);
              m.get(k).add(l);
         } 
         Queue<Integer> q=new LinkedList<>();
         for(int i=0;i<n;i++)
         {
             if(m.get(i).size()==1)
               q.add(i);
         }

         while(n>2)
         {
             int size=q.size();
             n=n-size;
             for(int i=0;i<size;i++)
             {
                 int x=q.poll();
                 int next=m.get(x).iterator().next();
                 m.get(next).remove(x);
                 if(m.get(next).size()==1)
                   q.add(next);
             }
         }
         List<Integer> l2=new ArrayList<>();

        while(q.size()>0)
         l2.add(q.poll());
          

      
        return  l2;
    }
}
