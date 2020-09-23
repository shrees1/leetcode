public class count11 {
    public static int count11(String str){
        if(str.length()<2){
            return 0;
        }
        if(str.substring(0,2).equalsIgnoreCase("11")){
            return 1+count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    public static void main(String[] args) {
        int result=count11("11x111x1111");
        System.out.println(result);
    }
}
