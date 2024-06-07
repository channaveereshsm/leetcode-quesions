class Solution {
    public String replaceWords(List<String> d, String s) {
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<d.size();i++)
        {
            h.put(d.get(i),1);
        }
        
        String w[]=s.split("\\s+");
        for(int i=0;i<w.length;i++)
        {
            String b=w[i];
            String b1=b;
            int f=1,k=1;
             while(k<w[i].length())
             { String a=b.substring(0,k);
                 k++;
                if(h.containsKey(a))
              {   
                  w[i]=a;
                  k=0;
                  f=0;  
              }
                          
              
              
              }
            if(f==1)
              {
                  w[i]=b1;
              }
            
        }
       
        String ans=w[0];
        for(int i=1;i<w.length;i++)
        {
            ans=ans+" "+w[i];
        }
        
        
        return ans;
    }
}