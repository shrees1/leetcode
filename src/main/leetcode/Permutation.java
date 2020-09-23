import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//https://leetcode.com/problems/next-permutation/
class Permutation {
    public static void nextPermutation(int[] nums) {
        int temp = 0;
        ArrayList<Integer> revArr = new ArrayList<>();
        int ref = Integer.MAX_VALUE;
        int n = nums.length - 1;
        int t = 0, i = 0, j = -1;
        int swap = 0;
        if (nums.length == 1) {
            return;
        }
        if (nums.length == 2) {
            int k = 0;
            k = nums[1];
            nums[1] = nums[0];
            nums[0] = k;
        }
        if (nums.length > 2) {
            for (i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < nums[n]) {
                    temp = nums[i];
                    j = i;
                    break;
                } else {
                    n--;
                }
            }
            if (n == 0) {
                Arrays.sort(nums);
                return;
            }
            for (int p = j + 1; p <= nums.length - 1; p++) {
                int diff = nums[p] - temp;
                if (diff < ref && diff > 0) {
                    ref = diff;
                    t = p;
                }
            }
            swap = nums[t];
            nums[t] = nums[i];
            nums[i] = swap;

            for (int k = i + 1; k <= nums.length - 1; k++) {
                revArr.add(nums[k]);
                // Arrays.sort(nums);
            }
            Collections.sort(revArr);
        }
        for (int h = 0; h <= revArr.size() - 1; h++) {
            nums[h + i + 1] = revArr.get(h);
        }

        for (int l = 0; l <= nums.length - 1; l++) {
            System.out.print(nums[l] + " ");
        }
    }

    public static void main(String[] args) {
        nextPermutation(new int[]{4,2,4,4,3});

    }

}