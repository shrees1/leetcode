
public class NumberOfSegments {

  public static int countSegments(String s) {
    int k = 0;
    String regex = "[//s+]";
    if (s.equals("") || s.substring(0, s.length() - 1).matches(regex)) {
      return 0;
    }
    //  s = " " + s;
//    for (int i = 0; i < s.length() - 1; i++) {
//      if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
//        k++;
//      }
//    }
//    return k;
    String[] splitStr = s.trim().split("\\s+");
    return splitStr.length;
  }

  public static void main(String[] args) {
    int res = countSegments("       ");
    System.out.print(res);
  }
}
