//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSell {

  public static int maxProfit(int[] prices) {

    int end = prices.length - 1;
    int maxP = 0;
    int[] mP = new int[prices.length];
    int maxProfit = 0;
    for (int i = end; i >= 0; i--) {
      maxP = Math.max(maxP, prices[i]);
        mP[i] = maxP;
      }
    for (int i = 0; i <= end; i++) {
      maxProfit = Math.max(mP[i] - prices[i], maxProfit);
    }

    return (maxProfit);
  }

  public static void main(String[] args) {
    int res = maxProfit(new int[]{1,2});
    System.out.println(res);
  }
}