public class ReplacePi {
    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equalsIgnoreCase("pi")) {
            return 3.14 + changePi(str.substring(2));
        }
        return str.charAt(0)+changePi(str.substring(1));
    }

    public static void main(String[] args) {
        String result = changePi("xpix  ");
        System.out.println(result);
    }
}
