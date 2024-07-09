class Solution {
    HashSet<Integer> m=new HashSet<>();
    public void dfs(List<List<Integer>> rooms,int p)
    {
        if(!m.add(p))
         return;
         m.add(p);
         for(int i=0;i<rooms.get(p).size();i++)
           dfs(rooms,rooms.get(p).get(i));
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
         m.add(0);
         for(int i=0;i<rooms.get(0).size();i++)
           dfs(rooms,rooms.get(0).get(i));
         if(m.size()==rooms.size())
         return true;
         return false; 
    }
}