class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<points.length;i++)
         l.add(points[i][0]);
         Collections.sort(l);
         int ans=1,x=l.get(0);
        w=w+1;
      //  System.out.println(l);
        for(int i=0;i<l.size();i++)
        {
          if(l.get(i)-x>=w)
          {
            x=l.get(i);
            ans++;
          } 
        }

        return ans;
    }
}