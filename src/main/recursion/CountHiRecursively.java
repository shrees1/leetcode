public class CountHiRecursively {
    public static int countX(String str) {
        if (str.length()<2) {
            return 0;
        }
        if ((str.charAt(str.length() - 1) == 'i') && (str.charAt(str.length() - 2) == 'h')) {
            return 1 + countX(str.substring(0, (str.length() - 1)));
        }

        return countX(str.substring(0, (str.length() - 1)));
    }

    public static void main(String[] args) {
        int result = countX("ihihihihihi");
        System.out.print(result);
    }
}
