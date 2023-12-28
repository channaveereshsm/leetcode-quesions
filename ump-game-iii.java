https://leetcode.com/problems/jump-game-iii/description/
class Solution {
    HashMap<Integer,Integer> m=new HashMap<>();
    int flag=0;

    public void  find(int arr[],int start)
    {
        if(start<0)
         return;
         if(start>=arr.length)
          return;
         
          if(arr[start]==0)
          { 
              flag=1;
              return;
          }

          if(!m.containsKey(start))
           { m.put(start,1);
           
              find(arr,arr[start]+start);
             
              find(arr,start-arr[start]);
           }
        
          
            

    }

    public boolean canReach(int[] arr, int start) {

        if(arr[start]==0)
         return true;
         
         find(arr,start);
        if(flag==1)
          return true;


          return false;
       
        
        
        
    }
}
