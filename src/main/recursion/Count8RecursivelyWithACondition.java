public class Count8RecursivelyWithACondition {
    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }
        if ((n % 10 == 8) && ((n / 10) % 10 == 8)) {
            return 2 + count8(n / 10);
        } else if (n % 10 == 8) {
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    public static void main(String[] args) {
        int result = count8(1818188);
        System.out.print(result);
    }
}
