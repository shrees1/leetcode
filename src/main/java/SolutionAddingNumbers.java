import java.util.HashMap;
import java.util.Map;

public class SolutionAddingNumbers {
    public static int[] twoSum(int[] nums, int target) {
       // List<Integer> numsList = Arrays.asList();
        Map<Integer, Integer> tMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length-1; i++) {
            tMap.put(nums[i], i);
        }
        for (int i = 0; i < tMap.size(); i++) {
            int sum = target - nums[i];
            if (tMap.containsKey(sum)) {
                return new int[]{tMap.get(sum),i};
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (target - nums[j] == nums[i]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
        return null;
    }

    //
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{11, 2, 7, 15}, 9);
        for (int res : result) {
            System.out.print(res);
        }
    }

}

