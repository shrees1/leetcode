public class MaximumArea {
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = 0;
        while (i < j) {
            max = Math.max((Math.min(height[i], height[j])) * (j - i), max);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int result = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(result);
    }
}