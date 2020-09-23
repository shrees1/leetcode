import java.util.ArrayList;
import java.util.List;

public class LongestIncresingSubsequence {
    public static List<Integer> largestSum(int[] nums) {

        List<Integer> subsetArr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i] ) {
                subsetArr.add(nums[i]);
                subsetArr.add(nums[i + 1]);
                //i += 2;
            }
        }

        return subsetArr;

    }

    public static void main(String[] args) {
        List<Integer> listOfArr = largestSum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3});
        System.out.println(listOfArr);
    }
}
