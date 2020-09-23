import java.util.HashMap;
import java.util.Map;

public class SubstringWithAtmostTwoDistinctChars {

  public static int lengthOfLongestSubstringTwoDistinct(String s) {
    Map<Character, Integer> sMap = new HashMap<>();
    int i = 0;
    int j = 0;
    int max = 0;
    while (j < s.length()) {
      if (sMap.size() < 3) {
        if (sMap.get(s.charAt(j)) == null) {
          sMap.put(s.charAt(j), 1);
        } else {
          sMap.put(s.charAt(j), sMap.get(s.charAt(j)) + 1);
        }
        j++;
      }
      if (sMap.size() == 3) {
        int del = (sMap.get(s.charAt(i)) - 1);
        if (del > 0) {
          sMap.put(s.charAt(i), del);
        } else {
          sMap.remove(s.charAt(i));
        }
        i++;

      }
      max = Math.max(max, j - i);
    }
    return max;
  }


  public static void main(String[] args) {
    int res = lengthOfLongestSubstringTwoDistinct("eceba");
    System.out.println(res);
  }
}
