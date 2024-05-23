class Solution {
    int c=0;
    public boolean check(List<Integer> l,int k)
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<l.size();i++)
        {
           if(m.containsKey(l.get(i)-k))
               return false;
           else
               m.put(l.get(i),1);
        }
        return true;
    }
    public void find(int[] nums,int k,int i,List<Integer> l){
        if(i==nums.length)
        { if(check(l,k))
            c++;
            return;}
        l.add(nums[i]);
        find(nums,k,i+1,l);
        l.remove(l.size()-1);
        find(nums,k,i+1,l);
        
        
    }
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        int dp[]=new int[1001];
         ArrayList<Integer> l=new ArrayList<>();
        find(nums,k,0,l);
        return c-1;
    }
}