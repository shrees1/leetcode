public class Count220 {
    public static boolean array220(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }
        if((index+1<nums.length)&&(nums[index + 1] == nums[index] * 10)) {
            return true;
        }
        return array220(nums, index + 1);
    }

    public static void main(String[] args) {
        boolean result=array220(new int[]{1, 2, 0},0);
        System.out.println(result);
    }
}
