public class UniqueAlphabets {

  public static boolean ifStringHasUniqueChar(String str) {
    boolean[] foundMap = new boolean[26];
    for (char ch : str.toCharArray()) {
      if (foundMap[ch - 'a'] == false) {
        foundMap[ch - 'a'] = true;
      } else {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    boolean result = ifStringHasUniqueChar("arow");
    System.out.println(result);
  }
}
