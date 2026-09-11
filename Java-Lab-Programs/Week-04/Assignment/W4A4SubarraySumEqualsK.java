import java.util.HashMap;
import java.util.Map;

public class W4A4SubarraySumEqualsK {
    static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>(); frequencies.put(0, 1);
        int sum = 0, count = 0;
        for (int value : nums) {
            sum += value; count += frequencies.getOrDefault(sum - k, 0);
            frequencies.put(sum, frequencies.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) { System.out.println(subarraySum(new int[]{1, 1, 1}, 2)); }
}
