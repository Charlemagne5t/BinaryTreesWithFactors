import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int modulo = 1_000_000_007;
        Arrays.sort(arr);
        int n = arr.length;
        Map<Integer, Long> dp = new HashMap<>();
        dp.put(arr[0], 1L);
        for (int i = 1; i < n; i++) {
            long curCount = 1;
            for (int j = 0; j < i; j++) {
                curCount = curCount + (dp.getOrDefault(arr[j], 0L) * dp.getOrDefault(arr[i] % arr[j] == 0 ? arr[i] / arr[j] : -1 , 0L)) % modulo;
                curCount = curCount % modulo;
            }
            dp.put(arr[i], curCount);
        }

        long sum = 0;
        for (long i : dp.values()){
            sum = (sum + i) % modulo;
        }

        return (int)sum;
    }
}
