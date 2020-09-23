import java.util.LinkedList;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        LinkedList<Character> parenthesis = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            parenthesis.add(s.charAt(i));
        }
        if (s.length() == 0) {
            return true;
        }
        if (s.length() == 1) {
            return false;
        }
        if (s.length()%2!=0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                switch (s.charAt(i)) {
                    case '(': {
                        if (parenthesis.contains(')')&& parenthesis.get(i+1).equals(')')) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    case '{':  {
                        if (parenthesis.contains('}')&& parenthesis.get(i+1).equals('}')) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    case '[':  {
                        if (parenthesis.contains(']')&& parenthesis.get(i+1).equals(']')) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    case ' ': {
                        if (parenthesis.get(i).equals(' ')) {
                            return true;
                        }
                        break;
                    }

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = isValid("([])");
        System.out.print(result);
    }
}
