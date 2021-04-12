public class ShortestWordDistance {

  public static int shortestDistance(String[] words, String word1, String word2) {
    int i1 = -1, i2 = -1;
    int minDistance = words.length;
    if (!word1.equalsIgnoreCase(word2)) {
      for (int i = 0; i < words.length; i++) {
        if (words[i].equals(word1)) {
          i1 = i;
        } else if (words[i].equals(word2)) {
          i2 = i;
        }

        if (i1 != -1 && i2 != -1) {
          minDistance = Math.min(minDistance, Math.abs(i1 - i2));
        }
      }
    } else {
      for (int i = 0; i < words.length; i++) {
        if (words[i].equalsIgnoreCase(word1)) {

          if (i1 == -1 ) {
            i1=i;
          }
          else{

            minDistance = Math.min(minDistance, Math.abs(i1 - i));
            i1=i;
          }
        }
      }
    }
    return minDistance;
  }


  public static void main(String[] args) {
    int res = shortestDistance(new
        String[]{"a","c","a","a"}, "a", "a");
    System.out.println(res);
  }
}
