public class CountXRecursively {
    public static int countX(String str) {
        if(str.length()==0){
            return 0;
        }
       return str.charAt(str.length()-1)=='x'?1+countX(str.substring(0,(str.length()-1))):countX(str.substring(0,(str.length()-1)));
    }

    public static void main(String[] args) {
        int result=countX("xxghgjhhjkxxx");
        System.out.print(result);
    }
}
