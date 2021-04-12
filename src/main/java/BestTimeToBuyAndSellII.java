public class BestTimeToBuyAndSellII {

  public static int maxProfit(int[] prices) {
    int j = prices.length - 2, ref = 0;
    int end = prices.length - 1;
    while (j >= 0) {
      ref = Math.max(ref, prices[end] - prices[j]);
      if (prices[j] > prices[end]) {
        end = j;
      }
      j--;
    }
    return ref;
  }

  public static void main(String[] args) {
    int res = maxProfit(new int[]{3,2,6,5,0,3});
    System.out.println(res);
  }

}
