class Solution {
    public int characterReplacement(String s, int k) {
       int max=0;
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'A']+=1;
        }
        for(int l=0;l<26;l++)
        {
            if(a[l]==0)
                continue; 
           char ch=(char)(l+'A');
            System.out.println(ch);
             int i=0,j=0,c=0;
        while(i<s.length())
        {
            if(s.charAt(i)!=ch)
                c++;
            while(c>k)
            {
                if(s.charAt(j)!=ch)
                    c--;
                j++;
            }
           
            max=Math.max(max,i-j+1);
             i++;
        }
        }
        
        return max;
    }
}