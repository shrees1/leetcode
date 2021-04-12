import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class NumbersDisappearedinArray {

  public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> al = new ArrayList<>();
        Set<Integer> hset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
          if (!hset.contains(nums[i])) {
            hset.add(nums[i]);
          }
        }
        for (int i = 1; i <=nums.length; i++) {
          if (!hset.contains(i)) {
            al.add(i);
          }
        }
        return al;
      }

  public static void main(String[] args) {
    List<Integer> al = findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    for (int i = 0; i < al.size(); i++) {
      System.out.print(al.get(i) + " ");
    }
  }
}
