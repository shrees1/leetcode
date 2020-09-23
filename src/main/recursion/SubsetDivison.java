import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SubsetDivison {
    public static boolean subsetDivison(ArrayList<Integer> subList, int n, int sum, int i, int m) {
        if (sum > 0 && sum % m == 0) {
            return true;
        }
        if (i >= subList.size() && subList.isEmpty()) {
            return false;
        }
//        boolean one
        if (!subList.isEmpty() && i < subList.size()) {
//            subList.remove(subList.get(i));
            boolean one  =subsetDivison(subList, n, sum , i + 1, 6);
            if(one)
                return one;
        }
        if (!subList.isEmpty() && i < subList.size()) {
            return subsetDivison(subList, n , sum + subList.get(i), i + 1, 6);
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(3);
        sub.add(1);
        //sub.add(7);
        sub.add(5);
        Set<Integer> subSet = new HashSet<>();
        boolean result = subsetDivison(sub, sub.size() - 1, 0, 0, 6);
        System.out.println(result);
    }
}
