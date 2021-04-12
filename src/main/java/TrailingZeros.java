public class TrailingZeros {
  public static int trailingZeroes(int n) {
    int zeroCount = 0;
    while (n > 0) {
      n =n/ 5;
      zeroCount += n;
    }
    return zeroCount;
  }

  public static void main(String[] args) {
    int res= trailingZeroes(13);
    System.out.println(res);
  }
}

