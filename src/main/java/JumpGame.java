public class JumpGame {

  public static boolean canJump(int[] nums) {
    int start = 0;
    int pos = 0;
    int end = nums.length - 1;
    if (nums.length == 1) {
      return true;
    }
    while (start < end) {
      if (pos < start) {
        return false;
      } else {
        pos = Math.max(pos, nums[start] + start);
        if (pos >= end) {
          return true;
        } else {
          start++;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    boolean res = canJump(new int[]{0, 2, 3});
    System.out.println(res);
  }
}
