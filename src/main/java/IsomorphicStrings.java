import java.util.HashMap;

public class IsomorphicStrings {

  public static boolean isIsomorphic(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }
    HashMap<Character, Character> dict = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (!dict.containsKey(s.charAt(i))) {
        if (dict.containsValue(t.charAt(i))) {
          return false;
        }
        dict.put(s.charAt(i), t.charAt(i));
      } else {
        if (dict.get(s.charAt(i)) != t.charAt(i)) {
          return false;
        }
      }
    }
    return true;
  }

    public static void main (String[]args){
      boolean res = isIsomorphic("bajc", "baba");
      System.out.println(res);
    }
  }
