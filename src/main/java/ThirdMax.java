import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMax {

  public static int thirdMax(int[] nums) {
    Set<Integer> hset = new HashSet<>();
    for (Integer i : nums) {
      hset.add(i);
      if (hset.size() > 3) {
        hset.remove(Collections.min(hset));
      }
    }
    if (hset.size() < 3) {
      return Collections.max(hset);
    }
    return Collections.min(hset);
  }

  public static void main(String[] args) {
    int res = thirdMax(new int[]{5,2,4,1,3,6,0});
    System.out.print(res);
  }
}
