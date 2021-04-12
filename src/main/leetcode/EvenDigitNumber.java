//https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3237/
public class EvenDigitNumber {

  public static int findNumbers(int[] nums) {
    String stringNums[] = new String[nums.length];
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      stringNums[i] = String.valueOf(nums[i]);
      if (stringNums[i].length() % 2 == 0) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int res = findNumbers(new int[]{12,345,2,6,7896});
    System.out.println(res);
  }
}
