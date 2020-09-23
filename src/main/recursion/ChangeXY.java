public class ChangeXY {
    public static String changeXY(String str) {
        char ch;
        if (str.length() == 0) {
            return str;
        }
        ch = str.charAt(0);
        if (ch == 'x') {
            String tempStrng = 'y' + changeXY(str.substring(1));
            return tempStrng;
        }
        String tempStrng= ch + changeXY(str.substring(1));
        return tempStrng;
    }

    public static void main(String[] args) {
        String result = changeXY("dex");
        System.out.println(result);
    }
}
