import java.util.ArrayList;
import java.util.List;

public class FlipGame {

  public static List<String> generatePossibleNextMoves(String currentState) {
      List<String> ls = new ArrayList<>();
      char ch[]=currentState.toCharArray();
      for (int i = 0; i < ch.length-1; i++) {
        if (ch[i] == '+' && ch[i + 1] == '+') {
          ch[i] = '-';
          ch[i + 1] = '-';
          ls.add(String.valueOf(ch));
          ch[i] = '+';
          ch[i + 1] = '+';
        }

      }
      return ls;
    }

  public static void main(String[] args) {
    List<String> list=generatePossibleNextMoves("---+++-+++-+");
    for (int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
  }
}
