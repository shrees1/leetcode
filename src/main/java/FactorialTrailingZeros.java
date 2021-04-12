//https://leetcode.com/problems/factorial-trailing-zeroes/
public class FactorialTrailingZeros {


  public static int trailingZeroes(int n) {
    if (n == 0) {
      return 0;
    }
    int res = 1, j;
    for (j = 2; j <= n; j++) {
      res *= j;
    }
    String str = String.valueOf(res);
    int count = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      if(str.charAt(i)!='0'){
        break;
      }
      if (str.charAt(i) == '0') {
        count++;
      }

    }
    return count;
  }

  public static void main(String[] args) {
    int res = trailingZeroes(13);
    System.out.println(res);
  }
}
