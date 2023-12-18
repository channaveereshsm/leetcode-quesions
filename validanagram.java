import java.lang.reflect.Array;
import java.util.Arrays;

public class validanagram {
    public static boolean check(String s,String t)
    {
        if(s.length()!=t.length())
         return false;

        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
         for(int i=0;i<c1.length;i++)
         {
            if(c1[i]!=c2[i])
              return false;
         }

        return true;

    }


    public static void main(String[] args) {
        String s="car";
        String t="cat";
        boolean b=check(s,t);
        System.out.println("valid anagram of two string is "+b);
    }
    
    
}
