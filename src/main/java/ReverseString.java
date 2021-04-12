public class ReverseString {
  public static void reverseString(char[] s) {
    int fP=0;
    int bP=s.length-1;
    while(fP<bP){
     char ch=s[fP];
     s[fP]=s[bP];
     s[bP]=ch;
      fP++;
      bP--;
    }
    for(int i=0;i<s.length;i++){
      System.out.print(s[i]+" ");
    }
  }

  public static void main(String[] args) {
    reverseString(new char[]{'h','e','l','l','o'});
  }
}
