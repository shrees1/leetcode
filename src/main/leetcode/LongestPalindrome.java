public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        if (s.equalsIgnoreCase(null) || s.equalsIgnoreCase("") || s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            StringBuilder sb = new StringBuilder(s);
            String subResult = sb.reverse().toString();
            if (s.equalsIgnoreCase(subResult)) {
                return s;
            }
            return "" + s.charAt(0);
        }
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                String result = s.substring(left, right + 1);
                StringBuilder sb = new StringBuilder(result);
                String subResult = sb.reverse().toString();
                if (result.equalsIgnoreCase(subResult)) {
                    return result;
                }
            }
            left++;
            right--;
        }
        return "";
    }

    public static void main(String[] args) {
        String res = longestPalindrome("sbb");
        System.out.println(res);
    }
}
