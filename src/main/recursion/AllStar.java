public class AllStar {
    public static String allStar(String str) {
        if ((str.length() == 1)||  (str.equals("")) ) {
            return str;
        }
        return str.charAt(0)+"*" + allStar(str.substring(1));
    }

    public static void main(String[] args) {
        String result=allStar("hello");
        System.out.println(result);
    }
}
