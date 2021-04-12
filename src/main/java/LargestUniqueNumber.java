import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LargestUniqueNumber {

  public static int largestUniqueNumber(int[] A) {
    Map<Integer, Integer> hmap = new HashMap<>();
    int res = -1;
    for (int i = 0; i < A.length; i++) {
      if (!hmap.containsKey(A[i])) {
        hmap.put(A[i], 1);
      } else {
        hmap.put(A[i], hmap.get(A[i]) + 1);
      }
    }
    for (Entry<Integer, Integer> entry : hmap.entrySet()) {
      if (entry.getValue() == 1) {
        res = Math.max(res, entry.getKey());
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int res = largestUniqueNumber(new int[]{5, 7, 3, 9, 4, 9, 8, 3, 1});
    System.out.println(res);
  }
}
