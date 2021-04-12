import java.util.Arrays;

public class MinInRotatedSortedArray {

  public static int findMin(int[] nums) {
      int max = nums[0];

      for (int i = 0; i < nums.length; i++) {
        max = Math.min(max, nums[i]);

      }
      return max;
    }

  public static void main(String[] args) {
    int res = findMin(new int[]{3, 4, 5, 1, 2});
    System.out.println(res);
  }
}
