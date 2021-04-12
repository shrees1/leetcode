public class SumOfDigitsInMinNum {

  public static int sumOfDigits(int[] A) {
    int min_val = Integer.MAX_VALUE;
    int sum = 0;
    int d = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] < min_val) {
        min_val = A[i];
      }
    }
    while (min_val > 0) {
      d = min_val % 10;
      sum += d;
      min_val = min_val / 10;
    }
    if (sum % 2 == 0) {
      return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    int res = sumOfDigits(new int[]{99, 77, 33, 66, 55});
    System.out.println(res);
  }
}