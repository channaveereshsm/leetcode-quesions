class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> s=new Stack<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<position.length;i++)
        {
            m.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        double t1=0;
        int c=0;
        for(int i=position.length-1;i>=0;i--)
        {
            double t=(double)(target-position[i])/m.get(position[i]);
          
            if(t1<t)
            {
                t1=t;
                c++;
            }
            
            
            
        }

        return c;
    }
}