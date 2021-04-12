import java.util.HashMap;
import java.util.Map;

public class TwoSumWithConstructor {

  Map<Integer, Integer> sumMap;

  public TwoSumWithConstructor() {
    this.sumMap = new HashMap<>();
  }

  /**
   * Add the number to an internal data structure..
   */
  public void add(int number) {
    if (!sumMap.containsKey(number)) {
      sumMap.put(number, sumMap.get(number) + 1);
    } else {
      sumMap.put(number, 1);
    }
  }

  /**
   * Find if there exists any pair of numbers which sum is equal to the value.
   */
  public boolean find(int value) {
    for (Map.Entry<Integer, Integer>  emap:sumMap.entrySet()){
      int complement=Math.abs(value-emap.getKey());
      if (sumMap.containsKey(complement)){
        return true;
      }
    }
    return false;
  }
}
