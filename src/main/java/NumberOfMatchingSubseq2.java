import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-matching-subsequences/
public class NumberOfMatchingSubseq2 {

  public int numMatchingSubseq(String s, String[] words) {
    char ch[] = s.toCharArray();
    int count=0,index=0;
    Map<Character, Integer> sMap = new HashMap<>();
    for (int i = 0; i < ch.length; i++) {
      sMap.put(ch[i], sMap.get(ch[i]));
    }
    Map<Character, Integer> wMap = new HashMap<>();
    for(int i=0;i<words.length;i++){
      char ch1[]=words[i].toCharArray();
      for(int j=0;j<ch.length;j++){

      }
    }
    return 0;
  }

}
