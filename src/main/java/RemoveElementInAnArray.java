public class RemoveElementInAnArray {

  public static int[] removeElement(int[] nums, int val) {
      int i = 0;
      int n = nums.length;
      while (i < n) {
        if (nums[i] == val) {
          nums[i] = nums[n - 1];
          n--;
        } else {
          i++;
        }
      }
      return nums;
    }

  public static void main(String[] args) {
    int[] nums = new int[]{3,2,2,3};
    int[] n = removeElement(nums, 3);
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
  }
}
