public class RecursiveSumOfDigits {

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + sumDigits(n / 10));
    }

    public static void main(String[] args) {
        int result = 0;
        result = sumDigits(235);
        System.out.print(result);
    }
}
