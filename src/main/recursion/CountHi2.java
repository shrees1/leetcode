public class CountHi2 {
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equalsIgnoreCase("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        if (str.length() >= 3) {
            if ((str.substring(0, 1).equalsIgnoreCase("x")) && (str.substring(1, 3)).equalsIgnoreCase("hi")) {
                return countHi2(str.substring(3));
            }
        }
        return countHi2(str.substring(1));
    }

    public static void main(String[] args) {
        int result = countHi2("ahixhi");
        System.out.println(result);
    }
}