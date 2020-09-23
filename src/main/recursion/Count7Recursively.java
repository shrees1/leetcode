public class Count7Recursively {
    static int count = 0;

    public static int count7(int n) {
        if(n == 0) return 0;
        if(n % 10 == 7) return 1 + count7(n / 10);
        return count7(n / 10);
    }

    public static void main(String[] args) {
        int result = count7(776);
        System.out.print(result);
    }
}
