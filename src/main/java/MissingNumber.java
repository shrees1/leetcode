public class MissingNumber {

  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int sumNums = 0;
    int sumN = n * (n + 1) / 2;
    for (int i = 0; i < nums.length; i++) {
      sumNums += nums[i];
    }
    return sumN - sumNums;
  }

  public static void main(String[] args) {
    int res = missingNumber(new int[]{3, 0, 1});
    System.out.println(res);
  }
}
