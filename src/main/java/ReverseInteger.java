public class ReverseInteger {
    public static int reverse(int x) {
        char[] ch = String.valueOf(Math.abs(x)).toCharArray();
        char[] newCh = new char[ch.length];
        int count = 0;
        String str = null;
        for (int i = ch.length - 1; i >= 0; i--) {
            newCh[count] = ch[i];
            count++;
        }
        for (int i = 0; i < newCh.length; i++) {
            str = String.valueOf(newCh);
        }
        if (x < 0) {
            return -Integer.parseInt(str);
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        int result = reverse(-123);
        System.out.print(result);
    }
}
