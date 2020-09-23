public class MaximumConsecutiveOnes {

  public static int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int backup = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count++;
      } else {
        if (backup < count) {
          backup = count;
        }
        count = 0;
      }
    }
    return Math.max(backup, count);
  }

  public static void main(String[] args) {
    int result = findMaxConsecutiveOnes(
        new int[]{1, 0, 1, 1, 0, 1});
    System.out.println(result);
  }
}
