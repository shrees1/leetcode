import java.util.Arrays;

public class MissingNumber {

  public static int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (i != nums[i]) {
        return i;
      }
    }
    return nums[nums.length - 1]+1;
  }

  public static void main(String[] args) {
    int res = missingNumber(new int[]{0});
    System.out.println(res);
  }
}

