public class nextGreaterMethod {
    static void findNext(int num) {
        char[] ch = String.valueOf(num).toCharArray();
        for (int i = ch.length - 1; i > 0; i--) {
            if (ch[i] > ch[i - 1]) {
                break;
            }
        }
    }
}
