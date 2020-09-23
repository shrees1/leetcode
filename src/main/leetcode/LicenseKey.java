import java.util.Stack;

public class LicenseKey {
    public static String licenseKeyFormatting(String S, int K) {
        String res = "";
        int count = 0;
//        for (int i = 0; i < S.length(); i++) {
//        res = S.replaceAll("-", "");
//    }
//    StringBuilder sb = new StringBuilder(res);
//        for (int j = (res.length()) - K; j > 0; ) {
//        sb.insert(j, '-');
//        j=j-K;
//
//    }
//        return sb.substring(0).toUpperCase();
        Stack<Character> stringStack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '-') {
                stringStack.push(S.charAt(i));
            }
        }

        while(!stringStack.isEmpty()){
            res += stringStack.pop();
            count++;
            if (count == K &&!stringStack.isEmpty()) {
                res = res + "-";
               count=0;
            }
        }
        StringBuilder sb = new StringBuilder(res);
        return sb.reverse().substring(0).toUpperCase();
    }

    public static void main(String[] args) {
        String result = licenseKeyFormatting("5F3Z-2e-9-w",
                4);
        System.out.println(result);
    }
}
