import java.util.Arrays;

public class SortedSquares {

  public static int[] sortedSquares(int[] A) {
    int[] sArr = new int[A.length];
    for (int i = 0; i < A.length; i++) {
      sArr[i] = Math.abs(A[i] * A[i]);
    }
    Arrays.sort(sArr);
    return (sArr);
  }

  public static void main(String[] args) {
    int []nums=sortedSquares(new int[]{-7,-3,2,3,11});
    for (int i=0;i<nums.length;i++)
    System.out.print(nums[i]+" ");
  }
}
