class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
        a[s1.charAt(i)-'a']+=1;
        }
        int b[]=new int[26];
        int j=0,l=s1.length()-1;
        for(int i=0;i<s2.length();i++)
        {
            int f=0;
            b[s2.charAt(i)-'a']+=1;
           if(i-j<l)
           { 
            continue;
           }
           for(int k=0;k<26;k++)
           {
            if(a[k]!=b[k])
            {
            f=1;
            }

           }
           if(f==0)
            return true;
            b[s2.charAt(j)-'a']-=1;
            j++;
        }
        return false;
    }
}