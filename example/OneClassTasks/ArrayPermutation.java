package example.OneClassTasks;

public class ArrayPermutation {

    /**
     * <a href="https://leetcode.com/problems/build-array-from-permutation/">текст задачи</a>
     * @param nums целочисленный массив
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
