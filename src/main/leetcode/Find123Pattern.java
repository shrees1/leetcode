public class Find123Pattern {

  public static boolean find132pattern(int[] nums, int count,int c) {
    if (count < nums.length) {
    int[] pattern = new int[nums.length];
    pattern[0] = nums[count];
    int[] arrB = new int[nums.length];
     // pattern[0] = nums[count];
      count++;
      return actualOperation(pattern, nums, arrB,count,c);
    }
    return false;
  }

  private static boolean actualOperation(int[] pattern, int[] nums, int[] arrB, int count, int c) {
    for (int i = count; i < nums.length; i++) {
      if (nums[i] > pattern[0]) {
        arrB[c] = nums[i];
        c++;
        count++;
      }
      for (int j = count; j < nums.length; j++) {
        if (nums[j] < arrB[j] && arrB[j] > pattern[0]) {
          return true;
        } else {
          find132pattern(nums, count,c);
        }
      }

    }
    return false;
  }

  public static void main(String[] args) {
    boolean res = find132pattern(new int[]{ 3,1,2, 4},0,0);
    System.out.println(res);
  }
}
