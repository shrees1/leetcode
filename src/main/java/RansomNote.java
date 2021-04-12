import java.util.HashMap;
import java.util.Map;

public class RansomNote {

  public static boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> rnsMap = constructMap(ransomNote);
    Map<Character, Integer> mgzMap = constructMap(magazine);
    for (Character temp : rnsMap.keySet()) {
      int countOfRanson = rnsMap.get(temp);
      int countOfMgz = mgzMap.getOrDefault(temp,0);
      if (countOfRanson > countOfMgz) {
        return false;
      }
    }
    return true;
  }

  public static Map constructMap(String str) {
    Map<Character, Integer> hmap = new HashMap<>();
    char[] ch = str.toCharArray();
    for (Character temp : ch) {
      if (!hmap.containsKey(temp)) {
        hmap.put(temp, 1);
      } else {
        hmap.put(temp, hmap.get(temp) + 1);
      }
    }
    return hmap;
  }

  public static void main(String[] args) {
    boolean res = canConstruct("albino", "baa");
    System.out.print(res);
  }
}
