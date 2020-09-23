import java.util.ArrayList;
import java.util.List;

public class LargestContinuousSubArray {
    public static List<Integer> largestSum(int[] nums) {
        int sum = 0;
        int start = 0;
        int end = 0;
        List<Integer> subsetArr= new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            end = Math.max(end,i);
            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }
        while(start<end){
            subsetArr.add(nums[start]);
            start++;
        }

        return subsetArr;

    }

    public static void main(String[] args) {
        List<Integer> listOfArr = largestSum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3});
        System.out.println(listOfArr);
    }
}
