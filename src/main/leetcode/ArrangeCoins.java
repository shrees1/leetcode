public class ArrangeCoins {

  //https://leetcode.com/explore/featured/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3377/
  public static int arrangeCoins(int n) {
    long count = 0;
    int level = 0;
    if (n == 1 || n == 0) {
      return n;
    }

    while (count <= n) {
      level++;
      count = count + level;
    }
    return level - 1;
  }

  public static void main(String[] args) {
    int result = arrangeCoins(2);
    System.out.println(result);
  }
}
