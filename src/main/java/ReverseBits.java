public class ReverseBits {

  public static int reverseBits(int n) {
    String rev = "";
    String num = "";
    int count = 31;
    char[] ch = String.valueOf(n).toCharArray();
    for (int i = ch.length - 1; i >= 0; i--) {
      rev += ch[i];
    }
    char[] ch1 = rev.toCharArray();
    for (int i = 0; i < ch1.length; i++) {
      num += String.valueOf(Integer.parseInt(String.valueOf(ch1[i])) * Math.pow(2, count));
      count--;
    }
    return Integer.parseInt(num);
  }

  public static void main(String[] args) {
  //  int res = reverseBits(00000010100101000001111010011100);
  }
}
