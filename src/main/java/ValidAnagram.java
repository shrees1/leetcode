public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    boolean flag=true;
    int [] sArray= new int[26];
    for(int i=0;i<s.length();i++){
      sArray[s.charAt(i)-'a']++;
    }
    for(int i=0;i<t.length();i++){
      sArray[t.charAt(i)-'a']--;
    }
    for(int i=0; i<sArray.length;i++){
      if(sArray[i]!=0){
        flag= false;
      }
    }
    return flag;
  }
}

