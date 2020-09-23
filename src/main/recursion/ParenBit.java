public class ParenBit {
    static String bitString = null;

    public static String parenBit(String str) {
        int len = str.length() - 1;
        if (bitString != null) {
            return bitString;
        }
        if ((str.charAt(0) == '(') && (str.charAt(len) == ')')) {
            bitString = str.substring(0, len + 1);
            return bitString;
        }
        if ((str.charAt(0) == '(') && (str.charAt(len) != ')')) {
            return parenBit(str.substring(0, len));
        }
        if ((str.charAt(0) != '(') && (str.charAt(len) == ')')) {
            return parenBit(str.substring(1, len+1));
        }
        return parenBit(str.substring(1, len));
    }


    public static void main(String[] args) {
        String result = parenBit("xyz(1111)123");
        System.out.println(result);
    }
}
