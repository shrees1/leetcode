import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> children;
    char value;
    boolean endOfWord;

    public TrieNode() {
        children = new HashMap<>();
        endOfWord = false;
    }

    private static final TrieNode root = new TrieNode();

    public static void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
           // System.out.println(node);
            if (node == null) {
                node = new TrieNode();
                //node.value=ch;
                current.children.put(ch, node);
                TrieNode tempNode = current.children.get(ch);
                System.out.println("");
//                current = node
            }
            current = node;
            System.out.println(node);
        }
        current.endOfWord = true;
    }

    public static boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }

    public static void main(String[] args) {
        insert("boy");
        insert("dog");
        boolean result = search("body");
        System.out.println(result);
    }
}


