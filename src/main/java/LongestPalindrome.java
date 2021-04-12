public class LongestPalindrome {

  public static int longestPalindrome(String s) {
    int[] sArray = new int[26];
    int countO = 0;
    int countE = 0;
    int reqLength = 0;
    for (int i = 0; i < s.length(); i++) {
      sArray[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < sArray.length; i++) {
      if (sArray[i] % 2 == 0) {
        countE++;
      }
      if (sArray[i] % 2 != 0) {
        countO++;
      }
    }
    if (countO == 0) {
      reqLength = s.length();
    } else {
      reqLength = (s.length() - countO)+1;
    }

    return reqLength;
  }

  public static void main(String[] args) {
    int res = longestPalindrome("aw");
    System.out.print(res);
  }
}