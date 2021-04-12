public class SearchInaRotatedArray {

  public static int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] >= nums[low]) {
        if (target >= nums[low] && target < nums[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        if (target <= nums[high] && target > nums[mid]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int res = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    System.out.println(res);
  }
}
