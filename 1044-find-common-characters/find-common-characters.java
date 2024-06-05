class Solution {
    public List<String> commonChars(String[] words) {
        int ans[]=new int[26];
        Arrays.fill(ans,10000);
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            int a[]=new int[26];
             for(int j=0;j<s.length();j++)
             {
               a[s.charAt(j)-'a']+=1;  
             }
            for(int j=0;j<26;j++)
            {
                ans[j]=Math.min(ans[j],a[j]);
            }
        }
        List<String> l=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            for(int j=1;j<=ans[i];j++)
            {
                char c=(char)(i+'a');
                String s=c+"";
                l.add(s);
            }
        }
        return l;
    }
}