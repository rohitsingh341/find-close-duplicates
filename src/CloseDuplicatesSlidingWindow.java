import java.util.HashSet;

public class CloseDuplicatesSlidingWindow {
    public static void main(String[] args) {
        // int [] nums = {1,2,3,4,5,6,5,9};
        // int size = k;

        int [] nums = {1,2,3,4,5,6,5,9};
        int size = 3;

        System.out.println(findCloseDuplicates(nums, size));
    }

    static boolean findCloseDuplicates(int[] nums, int K) {
        HashSet<Integer> window = new HashSet<>();

        int L = 0;

        for (int R = 0; R < nums.length; R++) {
            if (R - L + 1 > K) {
                window.remove(nums[L]);
                L++;
            }
            if (window.contains(nums[R])) {
                return true;
            }
            window.add(nums[R]);
        }
        return false;
    }
}
