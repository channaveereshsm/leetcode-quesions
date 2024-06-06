class Solution {
    public boolean isPossibleDivide(int[] hand, int g) {
        Arrays.sort(hand);
        HashMap<Integer,Integer> m=new HashMap<>(); 
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<hand.length;i++)
        {
            if(!m.containsKey(hand[i]))
            {
                l.add(hand[i]);
                m.put(hand[i],1);
            }
            else
            {
                m.replace(hand[i],m.get(hand[i])+1);
            }
        }
        int i=0;
        while(i<l.size()){
            int x=0,y=l.get(i);
             while(x<g && m.containsKey(y))
             {
                 if(m.get(y)==0)
                 {
                     break;
                 }
                 m.replace(y,m.get(y)-1);
                 x++;
                 y=y+1;
             }
            if(x==0)
            {
                i=i+1;
                continue;
            }
            if(x!=g)
                return false;
        }
        
        
        
        return true; 
    }
}