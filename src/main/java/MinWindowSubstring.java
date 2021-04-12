public class MinWindowSubstring {

  public static String minWindow(String s, String t) {
    String p = "";
    String temp = "";
    String backup = "";
    int left = 0;
    int right = 0;
    while (left <= right) {
      if (right < s.length() - 1) {
        p += Character.toString(s.charAt(right));
        right++;
      }
//      else {
//        System.out.println(s.charAt(left));
//        p += Character.toString(s.charAt(left));
//        System.out.println("I am here " + p);
//        left++;
//      }

      if (p.length() >= t.length()) {
        boolean res = bakchodi(p, t);
        if (res == true) {
          if (temp.length() < p.length()) {
            backup = temp;
          }
          temp = p;
          p = "";
          left++;
          right = left;
        }
      }
    }
    if (backup.length() < temp.length()) {
      return backup;
    }

    return temp;
  }

  private static boolean bakchodi(String p, String t) {
    int count = 0;
    int l = 0;
    for (int i = 0; i < p.length(); i++) {
      if (p.charAt(i) == t.charAt(l) || p.charAt(i) == t.charAt(l + 1) || p.charAt(i) == t
          .charAt(l + 2)) {
        count++;
      }
    }
    if (count == t.length()) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    String res = minWindow("ADOBECODEBANC", "ABC");
    System.out.println(res);
  }
}
