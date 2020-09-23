import java.util.Arrays;

public class ThreeSumClosest {
    static int closestSum = Integer.MAX_VALUE;
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int l = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for (int i=0; i<l; i++) {
            int j=i+1;
            int k=l-1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) return sum;
                else if (sum < target) j++;
                else k--;

                if (Math.abs(target - sum) < minDiff) {
                    minDiff = Math.abs(target - sum);
                    result = sum;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
         int result = threeSumClosest(new int[]{-1, 1, 1}, 2);
        System.out.print(result);
    }
}

