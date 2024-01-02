https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int nearestExit(char[][] m, int[] e) {
       Queue<Integer> q1=new LinkedList<>();
       Queue<Integer> q2=new LinkedList<>();
       int dp[][]=new int[m.length][m[0].length];
 
       q1.add(e[0]);
       q2.add(e[1]);
      
      
      m[e[0]][e[1]]=1;
       int dx[]={1,-1,0,0};
       int dy[]={0,0,1,-1};
     int ans=1;
       while(q1.size()!=0)
       {
           int size=q1.size();
          
           for(int i=0;i<size;i++)
           {  
              int x1=q1.poll();
              int y1=q2.poll();
               for(int k=0;k<4;k++)
                  {   
                     int x=x1+dx[k];
                     int y=y1+dy[k];
                     
                  
                     if(x<0||y<0||x>=m.length||y>=m[0].length)
                       continue;
                        
                     if(m[x][y]=='+'||m[x][y]==1)
                      continue;  
                   
                      m[x][y]=1;
                       
                     
                     if((x==m.length-1||y==m[0].length-1||x<=0||y<=0) )
                           return ans;
                         q1.add(x);
                         q2.add(y);
                         
                         
                     }    
                   }
             ans++;
            
            
       }
       
        return -1;
        
       

        
    }
}
