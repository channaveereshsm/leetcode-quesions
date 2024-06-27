class Solution {
    public int findCenter(int[][] edges) {
      int n[]=new int[edges.length+2];
      for(int i=0;i<edges.length;i++)
      {
        n[edges[i][0]]+=1;
        n[edges[i][1]]+=1;
      } 
      for(int i=0;i<n.length;i++)
      {
        if(n[i]==edges.length)
        return i;
      } 
      return 0;
    }
}