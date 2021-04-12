public class ValidWordAbbr {

  public static boolean validWordAbbreviation(String word, String abbr) {
    int i = 0;
    boolean flag = true;
    String regex = "[^0-9]";
    while (i < word.length()) {
      if (regex.matches(String.valueOf(abbr.charAt(i)))) {
        i = i + Integer.valueOf(abbr.charAt(i));
      } else if (word.charAt(i) != abbr.charAt(i)) {
        flag = false;
        break;
      } else {
        i++;
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    boolean res = validWordAbbreviation("internationalization", "i12iz4n");
    System.out.print(res);
  }
}

