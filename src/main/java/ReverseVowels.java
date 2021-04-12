import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

  public static String reverseVowels(String s) {
    int fP = 0;
    int bP = s.length() - 1;
    char ch[] = s.toCharArray();
    List<Character> vowList = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u','A','E','I','O','U'});
    while (fP < bP) {
      if (vowList.contains(ch[fP]) && (!vowList.contains(ch[bP]))) {
        bP--;
      }
      else if (!vowList.contains(ch[fP]) && (vowList.contains(ch[bP]))) {
        fP++;
      }
      else if (vowList.contains(ch[fP]) && (vowList.contains(ch[bP]))) {
        char c = ch[fP];
        ch[fP] = ch[bP];
        ch[bP] = c;
        bP--;
        fP++;
        s = String.valueOf(ch);
      }
     else {
        bP--;
        fP++;

      }
    }
    return s;
  }

  public static void main(String[] args) {
    String res=reverseVowels("a.");
    System.out.print(res);
  }
}


