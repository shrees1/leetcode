import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindDivisonOfThreeNumbers {
    static List<Long> addList=new ArrayList<>();
    static long Solve(long a, long b, long c) {
        // Write your code here
        long temp=0;
        for (long i = 0; i <= c; i++) {
            temp = i % a;
            if (temp == b) {
                addList.add(i);
                return addList.get(addList.size() - 1);
            }
        }
    return -1;
    }


    public static void main(String[] args) {
      Long result=  FindDivisonOfThreeNumbers.Solve(1,2,4);
      System.out.println(result);
    }
}
