import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersection {

  public static int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> li = new ArrayList<>();
    int[] nums = null;
    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();
    for (int i = 0; i < nums1.length; i++) {
      s1.add(nums1[i]);
    }
    for (int i = 0; i < nums2.length; i++) {
      s2.add(nums2[i]);
    }
    for (Integer temp : s1) {
      if (s2.contains(temp)) {
        li.add(temp);
      }
    }
    nums=new int[li.size()];
    for (int i = 0; i < li.size(); i++) {
      nums[i] = li.get(i);
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] res = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    for (int j = 0; j < res.length; j++) {
      System.out.print(res[j] + " ");
    }
  }
}

