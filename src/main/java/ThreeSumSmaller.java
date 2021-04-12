import java.util.Arrays;

//https://leetcode.com/problems/3sum-smaller/
public class ThreeSumSmaller {

  public static int threeSumSmaller(int[] nums, int target) {
    Arrays.sort(nums);
    int count = 0;
    int p = 0;
    int l = nums.length;
    for (int i = 0; i < l - 1; i++) {
      int j = i + 1;
      int k = l - 1;

      while (j != k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (j == i) {
          break;
        }
        if (sum == target && i > -1 && j > 0 && k < l) {
          k--;
        }
        if (sum < target) {
            k--;
          count++;
        }
        if (sum > target) {
          k--;
        }
      }
    }
    return count;
  }


  public static void main(String[] args) {
    int res = threeSumSmaller(new int[]{-2,3,0,1}, 4);
    System.out.println(res);
  }
}
