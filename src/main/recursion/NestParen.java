public class NestParen {
    public static boolean nestParen(String str) {
        if (str.equalsIgnoreCase("")) {
            return true;
        }
        if (str.length() != 0) {
            if ((str.charAt(0) == '(') && (str.charAt(str.length() - 1) == ')')) {
                return nestParen(str.substring(1, str.length() - 1));
            }
        }
        return false;

    }

    public static void main(String[] args) {
        boolean result = nestParen("((x))");
        System.out.println(result);
    }

}
