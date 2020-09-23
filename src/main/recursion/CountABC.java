public class CountABC {
    public static int countAbc(String str) {
        if(str.length()<3){
            return 0;
        }
        if(str.substring(0,3).equalsIgnoreCase("abc")||str.substring(0,3).equalsIgnoreCase("aba")){
            return 1+countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }

    public static void main(String[] args) {
        int result=countAbc("abcxxabc");
        System.out.println(result);
    }
}
