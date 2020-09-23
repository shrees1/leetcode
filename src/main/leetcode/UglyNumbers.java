import java.util.ArrayList;
import java.util.List;

public class UglyNumbers {

  public static int nthUglyNumber(int n) {
    List<Integer> arrList = new ArrayList<>();
    arrList.add(1);
    int[] count = new int[3];

    int next = 0;
    if (n == 1) {
      return n;
    }
    while (arrList.size() < n) {
      next = minOfThree(arrList.get(count[0]) * 2, arrList.get(count[1]) * 3, arrList.get(count[2]) * 5, count);
      arrList.add(next);
    }
    return arrList.get(arrList.size() - 1);
  }

  public static int minOfThree(int a, int b, int c, int[] count) {
    int min = Integer.MIN_VALUE;
    if (a <=b && a <=c) {
      min = a;
      count[0] += 1;
    }
    if (b <= a && b <=c) {
      min = b;
      count[1] += 1;
    }
    if (c <= b && c <= a) {
      min = c;
      count[2] += 1;
    }
    return min;
  }

  public static void main(String[] args) {
    int result = nthUglyNumber(11);
    System.out.println(result);
  }
}
