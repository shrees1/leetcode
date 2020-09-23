import java.util.*;

public class ThreeSumLeetCode {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            twoSums(nums, i, res);
        }
        return new ArrayList<>(res);
    }

    private static void twoSums(int[] nums, int i, HashSet<List<Integer>> res) {
        int lo = i + 1;
        int hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) {
                lo++;
            } else if (sum > 0) {
                hi--;
            } else {
                res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                lo++;
                hi--;
            }
        }
    }
}