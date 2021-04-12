import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

  public static int majorityElement(int[] nums) {
    HashMap<Integer, Integer> hmap = new HashMap<>();
    Map.Entry<Integer, Integer> majorityEntry = null;
    for (int i:nums) {
      if (!hmap.containsKey(i)) {
        hmap.put(nums[i], 1);
      } else {
        hmap.put(nums[i], hmap.get(i) + 1);
      }
    }
   for(Map.Entry<Integer,Integer> map:hmap.entrySet()){
     if(map.getKey()>(nums.length/2)){

     }
   }
   return 1;
  }

  public static void main(String[] args) {
    int result = majorityElement(new int[]{2,2,1,1,1,2,2});
    System.out.println(result);
  }
}
