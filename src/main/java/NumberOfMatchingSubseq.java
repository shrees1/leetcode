public class NumberOfMatchingSubseq {

  public static int numMatchingSubseq(String s, String[] words) {
    char[] ch = s.toCharArray();
    int count = 0;
    int finalCount = 0;
    int indexS = 0;
    int indexW = 0;
    for (int i = 0; i < words.length; i++) {
      char ch1[] = words[i].toCharArray();
      while (indexW < ch1.length && indexS < ch.length) {
        if (ch1[indexW] == ch[indexS]) {
          indexS++;
          indexW++;
          count++;
        } else {
          indexS++;
        }
      }
      if (count == ch1.length) {
        finalCount++;
      }
      indexS = 0;
      indexW = 0;
      count=0;
    }
    return finalCount;
  }

  public static void main(String[] args) {
    int s = numMatchingSubseq("abcde", new String[]{"a","bb","acd", "ace"});
    System.out.print("FinalCount is " + s);
  }
}

