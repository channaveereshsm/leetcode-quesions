class Solution {
    
    int ans=0;
    public String find(String s,String b,int val)
    {
        ArrayList<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
           if(l.size()!=0 && (l.get(l.size()-1)==b.charAt(0) && s.charAt(i)==b.charAt(1)))
           {
             ans=ans+val;
             l.remove(l.size()-1);
           }
           else
           {
            l.add(s.charAt(i));
           } 
        }
        StringBuilder temp=new StringBuilder();
       for(int i=0;i<l.size();i++)
       {
        temp.append(l.get(i));
       }
       return temp.toString();
       

    }
    public int maximumGain(String s, int x, int y) {
        String b="ab",c="ba";
      if(x>y)
      {
       b="ab";
      }  
      else
      {
        c="ba";
      }
      int max=Math.max(x,y);
      if(x>y)
      { s=find(s,"ab",x);
        s=find(s,"ba",y);
      }
      else
      { s=find(s,"ba",y);
         s=find(s,"ab",x);
        
      }
      return ans;

    }
}