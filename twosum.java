import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int [] a={1,4,6,4,2};
        int target=6;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(!m.containsKey(target-a[i]))
            {
                m.put(a[i],i);

            }
            else
            {
                System.out.println(m.get(target-a[i])+" "+i);
            }
        }
    }
    
}
