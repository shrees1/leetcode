public class CheckPermutations {

  public static boolean checkIfStringsArePermutaions(String str1, String str2) {
    int[] foundMap1 = new int[26];
    int[] foundMap2 = new int[26];
    if (str1.length() != str2.length()) {
      return false;
    }
    for (char ch : str1.toCharArray()) {
      foundMap1[ch - 'a']++;
    }
    for (char ch : str2.toCharArray()) {
      foundMap2[ch - 'a']++;
    }

    for (int i = 0; i < foundMap1.length; i++) {
      if (foundMap1[i] == foundMap2[i]) {
        continue;
      } else {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {
    boolean res = checkIfStringsArePermutaions("trebeup", "rpebvetu");
    System.out.println(res);
  }
}
