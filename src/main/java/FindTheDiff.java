public class FindTheDiff {

  public static char findTheDifference(String s, String t) {
    int ch[] = new int[26];
    int a = 0;
    char c=0;
    for(int i=0;i<t.length();i++){
      ch[t.charAt(i)-'a']++;
    }
    for(int i=0;i<s.length();i++){
      ch[t.charAt(i)-'a']--;
    }
    for (int i=0;i<ch.length;i++){
      if(ch[i]!=0){
         a=i+'a';
         c=(char)a;
      }
    }
    return c;
  }

  public static void main(String[] args) {
    char res=findTheDifference("ae","aea");
    System.out.print(res);
  }
}
