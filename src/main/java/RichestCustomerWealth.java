//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {

  public static int maximumWealth(int[][] accounts) {
    int res = 0, sum = 0;
    for (int i = 0; i < accounts.length; i++) {
      for (int j = 0; j < accounts[i].length; j++) {
        res = res + accounts[i][j];
      }
      sum = Math.max(sum, res);
      res=0;
    }
    return sum;
  }

  public static void main(String[] args) {
    int res = maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}});
    System.out.print(res);
  }
}
