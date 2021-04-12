public class TwoSumGreaterThanTgt {

  public static int greaterThanTgt(int[] nums, int tgt) {
    int lo = 0;
    int hi = nums.length - 1;
    int sum = 0;
    int count = 0;
    while (lo <=hi) {
      sum = nums[lo] + nums[hi];
      if (sum < tgt) {
        lo++;
      }
      if (sum == tgt) {
        lo++;
      }
      if (sum > tgt) {
        count++;
        if (lo == hi) {
          hi--;
          lo -= 2;
        }
        lo++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int res = greaterThanTgt(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 12);
    System.out.println(res);
  }

}
