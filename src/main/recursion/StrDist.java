public class StrDist {
    public static int strDist(String str, String sub) {
        int stLen = str.length();
        int sbLen = sub.length();
        if (stLen < sbLen) {
            return 0;
        }
        if (str.substring(0, sbLen).equals(sub)) {
            if (str.substring(stLen - sbLen, stLen).equals(sub)) {
                return stLen;
            }
            return strDist(str.substring(0, stLen - 1), sub);
        }
        return strDist(str.substring(1), sub);
    }

    public static void main(String[] args) {
        int result = strDist("catcowcat", "cat");
        System.out.println(result);
    }
}

