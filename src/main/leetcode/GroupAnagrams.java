import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public static List<List<String>> groupAnagrams(String[] strs) {
    if (strs.length == 0) {
      return new ArrayList();
    }
    Map<String, List> ans = new HashMap<String, List>();
    for (String s : strs) {
      char[] ca = s.toCharArray();
      Arrays.sort(ca);
      String key = String.valueOf(ca);
      if (!ans.containsKey(String.valueOf(ca))) {
        ans.put(key, new ArrayList());
      }
      ans.get(key).add(s);
      List l = ans.get(key);
      System.out.println("here "+l);
    }
    return new ArrayList(ans.values());
  }

  public static void main(String[] args) {
    List<List<String>> gAna = groupAnagrams(
        new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    System.out.println(gAna);
  }
}


