//https://leetcode.com/problems/keyboard-row/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {

  public static String[] findWords(String[] words) {
    String r1 = "qwertyuiop";
    String r2 = "asdfghjkl";
    String r3 = "zxcvbnm";
    boolean flag = false;
    List<String> returnString = new ArrayList<>();
    Map<Character, Integer> hmap = new HashMap<>();
    for (Character ch : r1.toCharArray()) {
      hmap.put(ch, 1);
    }
    for (Character ch : r2.toCharArray()) {
      hmap.put(ch, 2);
    }
    for (Character ch : r3.toCharArray()) {
      hmap.put(ch, 3);
    }
    for (int i = 0; i < words.length; i++) {
      char ch[] = words[i].toLowerCase().toCharArray();
      for (int j = 1; j < ch.length; j++) {
        int k = hmap.get(ch[0]);
        int l = hmap.get(ch[j]);
        if (k == l) {
          flag = true;
        } else {
          flag = false;
          break;
        }
      }
      if (flag == true) {
        returnString.add(words[i]);
      }

    }
    String[] arr = new String[returnString.size()];

    for (int i = 0; i < returnString.size(); i++) {
      arr[i] = returnString.get(i);
    }
    return arr;
  }

  public static void main(String[] args) {
    String[] res = findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    for (int i = 0; i < res.length; i++) {
      System.out.print(res[i]);
    }
  }
}
