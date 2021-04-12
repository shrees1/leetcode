public class LengthOfLastWord {

  public static int lengthOfLastWord(String s) {
//    if(s.length()==1 && s.charAt(0)!=' '){
//      return 1;
//    }
//      String result = findLastWord(s);
//      return result.length();
//  }
//
//  public static String findLastWord(String s) {
//    String output = "";
//    for (int i = s.length()-1; i > 0; i--) {
//      if (s.charAt(i) != ' ') {
//        output += s.charAt(i);
//      } else {
//        return output;
//      }
//    }
//    return output;
//  }
    int p = s.length(), length = 0;
    while (p > 0) {
      p--;
      // we're in the middle of the last word
      if (s.charAt(p) != ' ') {
        length++;
      }
      // here is the end of last word
      else if (length > 0) {
        return length;
      }
    }
    return length;
  }

  public static void main(String[] args) {
    int res = lengthOfLastWord("a");
    System.out.println(res);
  }
}
