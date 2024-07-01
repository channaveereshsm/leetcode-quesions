class Solution {
    public boolean canReorderDoubled(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!m.containsKey(nums[i]))
            {
                m.put(nums[i],1);
            }
            else
            {
                m.replace(nums[i],m.get(nums[i])+1);
            }
            if(nums[i]>=0)
            {
                l.add(nums[i]);
            }
            else
            {
                l1.add(nums[i]);
            }

        }
        Collections.sort(l);
        Collections.sort(l1);
        for(int i=l1.size()-1;i>=0;i--)
        {
            int x=l1.get(i);
            if(m.get(x)>0)
            {
                if(m.containsKey(2*x))
                {if(m.get(2*x)==0)
                {
                    return false;}
                 else
                 {
                    m.replace(x,m.get(x)-1);
                    m.replace(2*x,m.get(2*x)-1);
                 }
                }
                else
               { 
                return false;
               }

            }
        }
        
         for(int i=0;i<l.size();i++)
        {
            int x=l.get(i);
            if(m.get(x)>0)
            {
                if(m.containsKey(2*x))
                {if(m.get(2*x)==0)
                 return false;
                 else
                 {
                    m.replace(x,m.get(x)-1);
                    m.replace(2*x,m.get(2*x)-1);
                 }
                }
                else
                return false;

            }
        }
        



        return true;
    }
}