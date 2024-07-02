class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
         {
            if(!m.containsKey(nums1[i]))
            {
                m.put(nums1[i],1);
            }
            else
            {
                m.replace(nums1[i],m.get(nums1[i])+1);
            }
         }

         for(int i=0;i<nums2.length;i++)
         {
            int x=0;
            if(m.containsKey(nums2[i]))
             x=m.get(nums2[i]);
            if(x>0)
            {
                m.replace(nums2[i],x-1);
                l.add(nums2[i]);
            }
         }
         return l.stream().mapToInt(Integer::intValue).toArray();
    }
}