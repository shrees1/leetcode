public class TribonacciNumber {

  public static int tribonacci(int n) {
    int prev0 = 0;
    int prev1 = 1;
    int prev2 = 1;
    int sum = 0;
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 1;
    }
    for (int i = 3; i <= n; i++) {
      sum = prev0 + prev1 + prev2;
      prev0 = prev1;
      prev1 = prev2;
      prev2 = sum;
    }
    return sum;
  }

  public static void main(String[] args) {
    int res = tribonacci(25);
    System.out.println(res);
  }
}
