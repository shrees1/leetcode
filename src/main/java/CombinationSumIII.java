import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii/
public class CombinationSumIII {

  public static List<List<Integer>> combinationSum3(int k, int n) {
    int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    List<Integer> combList = new ArrayList<>();
    for (int i = 0; i < nums.length - 1; i++) {
      if (n - (nums[i] + nums[(i + 1)]) > 0) {
        int res = Arrays.binarySearch(nums, i + 1, nums.length - 1, n - (nums[i] + nums[(i + 1)]));
        combList.add(nums[res]);
        combList.add(nums[i]);
        combList.add(nums[i + 1]);
        break;
      }
    }
    return new ArrayList<List<Integer>>(Collections.singleton(combList));
  }

  public static void main(String[] args) {
    List<List<Integer>> res = combinationSum3(3, 7);
    System.out.println(res);
  }
}
