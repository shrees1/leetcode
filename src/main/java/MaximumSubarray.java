//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

  public static int maxSubArray(int[] nums) {
    int currSum = nums[0];
    int maxSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      currSum = Math.max(nums[i], currSum + nums[i]);
      maxSum = Math.max(currSum, maxSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int res = maxSubArray(new int[]{-2, -1});
    System.out.println(res);
  }
}
