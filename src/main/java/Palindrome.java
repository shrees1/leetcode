import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        char[] ch = String.valueOf(x).toCharArray();
        char[] newCh = new char[ch.length];
        int count = 0;
        String str = null;
        for (int i = ch.length - 1; i >= 0; i--) {
            newCh[count] = ch[i];
            count++;
        }
        if (Arrays.equals(newCh,ch)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean result = isPalindrome(616);
        System.out.print(result);
    }
}
