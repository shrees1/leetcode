public class StrCopies {
    static int count = 0;

    public static boolean strCopies(String str, String sub, int n) {
        int length = sub.length();
        if (count == n) {
            return true;
        }
        if (str.length() >= length) {
            if (str.substring(0, length).equalsIgnoreCase(sub)) {
                count += 1;
                return strCopies(str.substring(length), sub, n);
            }
        }
        if (str.length()>n) {
            return strCopies(str.substring(1), sub, n);
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = strCopies("catcowcat", "cow", 1);
        System.out.println(result);
    }
}