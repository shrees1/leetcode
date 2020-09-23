public class Count11InArray {
    public static int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        }
        return array11(nums, index + 1);
    }

    public static void main(String[] args) {
        int result = array11(new int[]{1, 2, 11}, 0);
        System.out.println(result);
    }
}
