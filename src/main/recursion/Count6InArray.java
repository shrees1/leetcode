public class Count6InArray {
    public static boolean array6(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);
    }

    public static void main(String[] args) {
        boolean result = array6(new int[]{}, 0);
        System.out.println(result);
    }

}
