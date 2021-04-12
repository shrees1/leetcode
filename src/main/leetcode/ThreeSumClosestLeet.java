import java.util.Arrays;

public class ThreeSumClosestLeet {

  static int minDiff = Integer.MAX_VALUE;

  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int res = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      res = twoSums(nums, i, target);
    }
    return res;
  }

  public static int twoSums(int[] nums, int i, int target) {
    int low = i + 1;
    int high = nums.length - 1;
    int temp = 0;
    while (low < high) {
      int sum = nums[i] + nums[low] + nums[high];
      temp = target-Math.abs(sum);
      System.out.println(temp);
      if (sum < target) {
        low++;
      } else {
        high--;
      }
      if (temp < minDiff) {
        minDiff = temp;
      }

    }
    return temp-minDiff;
  }

  public static void main(String[] args) {
    int result = threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
    System.out.println("Final "+result);
  }

}

