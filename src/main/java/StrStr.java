public class StrStr {

  public static int strStr(String haystack, String needle) {
    if(needle==""||haystack==""){
      return 0;
    }
    if (haystack.contains(needle)) {
      return haystack.indexOf(needle);
    }
    return -1;
  }

  public static void main(String[] args) {
    int res=strStr("","");
    System.out.println(res);
  }
}
