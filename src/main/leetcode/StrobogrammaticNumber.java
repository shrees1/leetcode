//https://leetcode.com/problems/strobogrammatic-number/
public class StrobogrammaticNumber {

  public static boolean isStrobogrammatic(String num) {
    int start = 0;
    int end = num.length() - 1;
    if (num.length() == 1) {
      if (num.equalsIgnoreCase("8") || num.equalsIgnoreCase("0") || num.equalsIgnoreCase("1")) {
        return true;
      } else {
        return false;
      }
    }
    while (start <= end) {
      if ((Character.valueOf(num.charAt(start)) == '6'
          && Character.valueOf(num.charAt(end)) == '9') || (
          Character.valueOf(num.charAt(start)) == '9'
              && Character.valueOf(num.charAt(end)) == '6')) {
        start++;
        end--;
      } else if (Character.valueOf(num.charAt(start)) == '1'
          && Character.valueOf(num.charAt(end)) == '1') {
        start++;
        end--;
      } else if (Character.valueOf(num.charAt(start)) == '0'
          && Character.valueOf(num.charAt(end)) == '0') {
        start++;
        end--;
      } else if (Character.valueOf(num.charAt(start)) == '8'
          && Character.valueOf(num.charAt(end)) == '8') {
        start++;
        end--;
      } else {
        break;
      }
    }
    if (start == end) {
      if (Character.valueOf(num.charAt(start)) == 8 || Character.valueOf(num.charAt(start)) == 1
          || Character.valueOf(num.charAt(start)) == 0) {
        return true;
      }
    } else if (start > end) {
      return true;
    }
    return false;

  }

  public static void main(String[] args) {
    boolean result = isStrobogrammatic("659");
    System.out.println(result);
  }
}
