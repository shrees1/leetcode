import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet finalSet = new HashSet();
        Arrays.sort(nums);
        List<Integer> tryList = null;
        List<List<Integer>> sumList = new ArrayList<List<Integer>>();
        HashSet sumSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            sumSet.add(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                tryList = new ArrayList<Integer>();
                int finalSum = -(nums[i] + nums[j]);
                if (sumSet.contains(finalSum)) {
                    tryList.add(nums[i]);
                    tryList.add(nums[j]);
                    tryList.add(finalSum);
                    sumList.add(tryList);
                }
            }

        }

        for (List<Integer> funList : sumList) {
            finalSet.add(funList);
        }
        if (nums.length < 3) {
            return new ArrayList<List<Integer>>();
        } else {
            return new ArrayList<>(finalSet);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> sumList = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.print(sumList);
    }
}
