import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> dupset = new HashSet<Integer>();
    for (int i : nums) {
      if (dupset.contains(i)) {
        return true;
      } else {
        dupset.add(i);
      }
    }
    return false;
  }
}
