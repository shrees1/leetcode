//https://leetcode.com/problems/longest-uncommon-subsequence-i/
public class LongestUncommonSubseq {

  public static int findLUSlength(String a, String b) {
    if (a.equals(b)) {
      return -1;
    } else {
      return Math.max(a.length(), b.length());
    }
  }

  public static void main(String[] args) {
    int res = findLUSlength("aefeaf", "a");
    System.out.print(res);
  }
}

