import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//https://leetcode.com/explore/interview/card/google/59/array-and-strings/3049/
public class ThreeSum3 {

  public static List<List<Integer>> threeSum(int[] nums) {
    Map<Integer, Integer> hmap = new HashMap<>();
    for (int k = 0; k < nums.length; k++) {
      hmap.put(nums[k], k);
    }
    HashSet<List<Integer>> listHashSet = new HashSet<>();
    List<Integer> dups = new ArrayList<>();
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (hmap.get(-(nums[i] + nums[j]))!=null && hmap.get(-(nums[i] + nums[j])) != i
            && hmap.get(-(nums[i] + nums[j])) != j) {
          dups = Arrays.asList(nums[i], nums[j], (-(nums[i] + nums[j])));
          Collections.sort(dups);
          listHashSet.add(dups);
        }
      }
    }

    return new ArrayList<>(listHashSet);
  }

  public static void main(String[] args) {
    List<List<Integer>> listofsum = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    System.out.println(listofsum);
  }
}
