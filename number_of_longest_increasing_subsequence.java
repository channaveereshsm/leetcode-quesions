import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * number_of_longest_increasing_subsequence
 */
public class number_of_longest_increasing_subsequence {
    public static int find(int[] a) {
        int dp[] = new int[a.length];
        int count[] = new int[a.length];
        Arrays.fill(count, 1);
        int max = 1;
        for (int i = 0; i < a.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    count[i] = count[j];
                } else if (a[i] > a[j] && dp[i] == dp[j] + 1) {
                    count[i] += count[j];
                }
            }
            max = Math.max(max, dp[i]);
        }
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (max == dp[i])
                res += count[i];
        }

        return res;

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 3, 5, 6, 7, 2 };
        int ans = find(a);
        System.out.println("number of largest increasing subsequence is " + ans);

    }
}