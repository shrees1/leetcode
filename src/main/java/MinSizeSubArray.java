public class MinSizeSubArray {

  public static int minSubArrayLen(int s, int[] nums) {
      if (nums.length == 0) {
        return 0;
      }
      int slow = 0, sum = nums[slow], total = Integer.MAX_VALUE;
      int fast = slow + 1;
      while (fast < nums.length || sum >= s) {
        if (sum < s) {
          sum += nums[fast];
          fast++;
        } else {
          total = Math.min(total, (fast - slow));
          sum -= nums[slow];
          slow++;
        }
      }
      if(total==Integer.MAX_VALUE){
        return 0;
      }
      return total;
    }

  public static void main(String[] args) {
    int res = minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
    System.out.println(res);
  }
}
