package example.OneClassTasks;

public class ArrayPermutation {

    /**
     * @param nums
     * @return массив, составленный из элементов nums по формуле ans[i] =
     *         nums[nums[i]]. nums[i] < nums.length.
     */
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
