import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    int ans = 10000;
    Map<String, Integer> memo = new HashMap<>();
    
    public void find(int[] s, int i, int sum) {
        if (i == -1) {
            if (sum >= 0)
                ans = Math.min(sum, ans);
            return;
        }
        
        String key = i + "," + sum;
        if (memo.containsKey(key)) {
            return;
        }
        
        find(s, i - 1, sum + s[i]);
        find(s, i - 1, sum - s[i]);
        
        memo.put(key, ans);
    }
    
    public int lastStoneWeightII(int[] s) {
        Arrays.sort(s);
        find(s, s.length - 1, 0);
        return ans;
    }
}
