public class CloseDulpicatesBruteForce {
    public static void main(String[] args) {


        // int [] nums = {1,2,3,4,5,6,5,9};
        // int size = k;

         int [] nums = {1,2,3,4,5,6,9};
         int size = 3;

        System.out.println(findCloseDuplicates(nums, size));
    }

    static boolean findCloseDuplicates (int[] nums, int k) {

        for (int L=0; L< nums.length; L++) {
            for(int R=L+1; R < Math.min(nums.length, L+k); R++) {
                if (nums[L] == nums[R]) {
                    return true;
                }
            }
        }
        return false;
    }
}