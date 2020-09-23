public class LongestPalindromeLC {
    public static String longestPalindrome(String s) {
        char ch[] = s.toCharArray();
        String result = "";
        String result1 = "";
        String temp = "";
        String temp1 = "";
        int left = 0;
        int mid = 0;
        int right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        String subResult = sb.reverse().toString();
        if (s.equalsIgnoreCase(subResult)) {
            return s;
        }
        int n = s.length() - 1;
        if (s.equalsIgnoreCase(null) || s.equalsIgnoreCase("") || s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            sb = new StringBuilder(s);
            subResult = sb.reverse().toString();
            if (s.equalsIgnoreCase(subResult)) {
                return s;
            }
            return "" + s.charAt(0);
        }
        for (int i = 1; i < s.length(); i++) {
            // int mid = (i + n) / 2;
            mid = i;
            if (mid > 0) {
                left = mid - 1;
            }
            if (mid != s.length() - 1) {
                right = mid + 1;
            }

            while (left < right && left >= 0 && right <= n) {

                if (ch[left] == ch[right]) {
                    result = s.substring(left, right + 1);
                    sb = new StringBuilder(result);
                    subResult = sb.reverse().toString();
                    if (result.equalsIgnoreCase(subResult) && (result.length() > temp.length())) {
                        temp = result;
                    }
                }
                left--;
                right++;

            }
        }
        for (int i = 0; i < s.length(); i++) {
            left = i;
            right = i + 1;
            while (left < right && left >= 0 && right <= n) {
                if (ch[left] == ch[right]) {
                    result1 = s.substring(left, right + 1);
                    sb = new StringBuilder(result1);
                    subResult = sb.reverse().toString();
                    if (result1.equalsIgnoreCase(subResult) && (result1.length() > temp1.length())) {
                        temp1 = result1;
                    }
                }
                left--;
                right++;
            }
        }
        if(temp.length()==0&&temp1.length()==0){
            return temp+s.charAt(0);
        }
        if (temp1.length() > temp.length()) {
            return temp1;
        }
        return temp;
    }

    public static void main(String[] args) {
        String res = longestPalindrome("jkol");
        System.out.println(res);
    }
}


