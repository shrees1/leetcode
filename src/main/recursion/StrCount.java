public class StrCount {
    public static int strCount(String str, String sub) {
        int length = sub.length();
        if (str.length() < length) {
            return 0;
        }
        if (str.length() >= length) {
            if (str.substring(0, length).equalsIgnoreCase(sub)) {
                return 1 + strCount(str.substring(length), sub);
            }
        }
        return strCount(str.substring(1), sub);
    }

    public static void main(String[] args) {
        int result = strCount("cacatcowcat", "cat");
        System.out.println(result);
    }

}
