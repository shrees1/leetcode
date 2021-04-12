//https://leetcode.com/problems/valid-palindrome/
public class PalindromeLC {

  public static boolean isPalindrome(String s) {
   // String str = s.replaceAll("[^a-zA-Z0-9]", "");

    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
      while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
        i++;
      }
      while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
        j--;
      }

      if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
        return false;
      }
    }

    return true;
  }


  public static void main(String[] args) {
    boolean res = isPalindrome("bbb:  ");
    System.out.println(res);
  }
}
