public class Palandrome {

  public static boolean isPalindrome(String s) {
      String str=s.replaceAll("[^a-zA-Z0-9]","");
      String pal="";
      for(int i=str.length()-1;i>=0;i--){
        pal+=str.charAt(i);
      }
      if(pal.toLowerCase().equalsIgnoreCase(str.toLowerCase())){
        return true;
      }
      else{
        return false;
      }
    }
  public static void main(String[] args) {
    Boolean res = isPalindrome("A man, a plan, a canal: Panama");
    System.out.println(res);
  }
}
