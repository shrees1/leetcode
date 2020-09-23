public class StringClean {
    public static String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public static void main(String[] args) {
        String result=stringClean("xxcchjh");
        System.out.println(result);
    }
}
