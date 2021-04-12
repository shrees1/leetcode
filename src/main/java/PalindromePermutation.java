public class PalindromePermutation {

  public static boolean canPermutePalindrome(String s) {
    int[] sArray = new int[26];
    char[] ch = s.toCharArray();
    int countO = 0;
    String str = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      str += s.charAt(i);
    }
    if (str.equalsIgnoreCase(s)) {
      return true;
    }
    for (int i = 0; i < ch.length; i++) {
      sArray[ch[i] - 'a']++;
    }
    for (int i = 0; i < sArray.length; i++) {
      if (s.length() % 2 == 0) {
        if (sArray[i] % 2 != 0) {
          return false;
        }
      }
      if (s.length() % 2 != 0) {
        if (sArray[i] % 2 != 0) {
          countO++;
        }
      }
    }
    if (ch.length % 2 == 1 && countO != 1) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    boolean res = canPermutePalindrome("aabbccc");
    System.out.print(res);
  }
}

