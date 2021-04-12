import java.util.HashMap;

public class NextGreaterI {

  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] res = new int[nums1.length];
    int j;
    HashMap<Integer, Integer> hmap = new HashMap<>();
    for (int i = 0; i < nums2.length; i++) {
      hmap.put(nums2[i], i);
    }
    for (int i = 0; i < nums1.length; i++) {
      for (j = hmap.get(nums1[i]) + 1; j < nums2.length; j++) {
        if (nums1[i] < nums2[j]) {
          res[i] = nums2[j];
          break;
        }
      }
        if (j == nums2.length) {
          res[i] = -1;
        }
      }
    return res;
  }

  public static void main(String[] args) {
    int[] res = nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
    for (int i = 0; i < res.length; i++) {
      System.out.print(res[i]+" ");
    }
  }
}
