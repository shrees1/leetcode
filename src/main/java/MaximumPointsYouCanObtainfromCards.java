//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
public class MaximumPointsYouCanObtainfromCards {

  public static int maxScore(int[] cardPoints, int k) {
    int res = 0;
    int res1 = 0;
    int res2 = 0;
    int bck = 0;
    int start = 0, end = cardPoints.length - 1;
    if (k == cardPoints.length) {
      for (int i = 0; i < k; i++) {
        res += cardPoints[i];
      }
      return res;
    }
    while (start <= k && end>start) {

      res1 += cardPoints[start];

      res2 += cardPoints[end];

      bck = Math.max(res1, res2);
      res = Math.max(res, bck);
      start++;
      end--;
    }
    return res;
  }

  public static void main(String[] args) {
    int res = maxScore(new int[]{2,2,2}, 2);
    System.out.print(res);
  }
}
