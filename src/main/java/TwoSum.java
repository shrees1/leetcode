import java.util.Arrays;

public class TwoSum {

  public static int[] twoSum(int[] numbers, int target) {
    int res = 0;
    int i = 0;
    while (i+1 < numbers.length) {
      res = Arrays.binarySearch(numbers, i+1, (numbers.length), (target - numbers[i]));
      if (res < 0) {
        i++;
      } else {
        break;
      }
    }

    return new int[]{i + 1, res + 1};
  }

  public static void main(String[] args) {
    int[] res = twoSum(new int[]{1,2,3,4,4,9,56,90}, 8);
    for (int i = 0; i < res.length; i++) {
      System.out.print(res[i] + " ");
    }
  }

}
