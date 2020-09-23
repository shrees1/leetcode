public class GroupSum {
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length) {
            return false;
        }
        if (nums[start] == target) {
            return true;
        }
        boolean result = groupSum(start+1,nums,target-nums[start]);
        if(result==true)
            return true;
        return groupSum( start+1, nums, target);
    }

    public static void main(String[] args) {
        boolean result=groupSum(0,new int[]{2, 4, 8}, 10);
        System.out.println(result);
    }
}
