import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPrefixTrie {
    Map<Character, TrieNode> children;
    boolean endOfWord;

    public LongestPrefixTrie() {
        children = new HashMap<>();
        endOfWord = false;
    }

    private static final TrieNode root = new TrieNode();

    public static int insert(String word, int count) {
        TrieNode current = root;
        int countOfNode = 0;
        int longestPrefix = Integer.MIN_VALUE;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node != null) {
                countOfNode += 1;
            }
            if (count > 0) {
                longestPrefix = countOfNode;
            }
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfWord = true;
        return longestPrefix;
    }

    public static void construct(List<String> listOfWords) {
        int result = 0;
        for (int i = 0; i < listOfWords.size(); i++) {
            result = insert(listOfWords.get(i), i);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("calrd");
        stringList.add("calve");
        stringList.add("calre");
        stringList.add("calt");
        construct(stringList);
    }

}


