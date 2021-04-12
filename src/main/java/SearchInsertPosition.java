public class SearchInsertPosition {

  public static int searchInsert(int[] nums, int target) {
    int i;
    for (i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
      if (nums[i] > target) {
        return i;
      }

    }
    return i;
  }

  public static void main(String[] args) {
    int res = searchInsert(new int[]{1, 3, 4,5, 6}, 7);
    System.out.println(res);
  }
}
