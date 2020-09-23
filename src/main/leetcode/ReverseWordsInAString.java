public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        int start = 0;
        int i = s.length() - 1;
        int end = i + 1;
        String result = " ";
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                start = i + 1;
                while (start != end) {
                    result = result + s.charAt(start++);
                    //end=i;
                }

                result+=' ';
                end = i;
            }
            i--;
        }
            start = 0;
            while (start != end)
                result += s.charAt(start++);

        return result;
    }



    public static void main(String[] args) {
        String res=reverseWords("the sky is pink");
        System.out.println(res);
    }
}
