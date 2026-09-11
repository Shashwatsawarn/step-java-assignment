import java.util.Arrays;

public class W4P5RotateArray {
    static int[] rotateArray(int[] nums, int k) {
        int[] result = new int[nums.length]; k %= nums.length;
        for (int i = 0; i < nums.length; i++) result[(i + k) % nums.length] = nums[i];
        return result;
    }
    public static void main(String[] args) { System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3))); }
}
