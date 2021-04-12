import java.util.ArrayList;
import java.util.List;

public class ArrayIntersectionII {

  public static int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> li = new ArrayList<>();
    int[] nums = null;
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    for (int i = 0; i < nums1.length; i++) {
      l1.add(nums1[i]);
    }
    for (int i = 0; i < nums2.length; i++) {
      l2.add(nums2[i]);
    }
    if (l2.size() > l1.size()) {
      for (Integer temp : l1) {
        if (l2.contains(temp)) {
          li.add(temp);
        }
      }
    }
    else if (l1.size() > l2.size()) {
      for (Integer temp : l2) {
        if (l1.contains(temp)) {
          li.add(temp);
        }
      }
    }
    else{
      for (Integer temp : l2) {
        if (l1.contains(temp)) {
          li.add(temp);
        }
      }
    }
    nums = new int[li.size()];
    for (int i = 0; i < li.size(); i++) {
      nums[i] = li.get(i);
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] res = intersection(new int[]{1}, new int[]{1});
    for (int j = 0; j < res.length; j++) {
      System.out.print(res[j] + " ");
    }
  }
}
