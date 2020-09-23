import java.util.HashSet;
import java.util.Set;

public class LongestSubstringBf {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
//        Set<Character> set = new HashSet<>();
        int max=0;
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();

            set.add(s.charAt(i));
            for (int j = i + 1; j < n; j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                } else {
                    set.add(s.charAt(j));
                    max=Math.max(max,set.size());

                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("pwwkew");
        System.out.println(result);
    }
}
