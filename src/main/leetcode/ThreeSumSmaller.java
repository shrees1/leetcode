import java.util.Arrays;

public class ThreeSumSmaller {

  public static int threeSumSmaller(int[] nums, int target) {
    if (nums == null || nums.length < 3) {
      return 0;
    }
    Arrays.sort(nums);
    int count = 0;
    int l = nums.length;
    for (int i = 0; i < l - 1; i++) {
      int j = i + 1;
      int k = l - 1;

      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == target) {
          k--;
          j--;
          if (k != j && k != i && j != i) {
            continue;
          }

        } else if (sum < target) {
          j++;
          count++;
        } else {
          k--;
        }
      }
    }
    return count;
  }


  public static void main(String[] args) {
    int res = threeSumSmaller(new int[]{3, 1, 0, -2}, 4);
    System.out.println(res);
  }
}
