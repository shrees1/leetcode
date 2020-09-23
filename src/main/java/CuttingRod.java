public class CuttingRod {
    public static int cuttingRod(int sumP, int sumL, int[] price, int[] length, int i) {

        if (i >= price.length) {
            return -1;
        }
        if (sumL == 8) {
            return sumP;
        }
        return Math.max(cuttingRod(sumP, sumL, price, length, i + 1),
                cuttingRod(sumP += price[i], sumL += length[i], price, length, i + 1));
    }

    public static void main(String[] args) {

        {
            int priceArr[] = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
            int length[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
            System.out.println("Maximum Obtainable Value is " +
                    cuttingRod(0, 0, priceArr, length, 0));

        }
    }
}
