public class MinWindowSubstring {

  public static String minWindow(String s, String t) {
    String p = null;
    String temp = null;
    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < i + t.length(); j++) {
        char c = s.charAt(j);
        p = Character.toString(c);
        if (p.contains(t)) {
          temp = p;
        }
      }
    }
        if (temp!=null && p.length() < temp.length()) {
          return p;
        } else {
          return temp;
        }
      }


  public static void main(String[] args) {
    String res = minWindow("ADOBECODEBANC", "ABC");
    System.out.println(res);
  }
}
