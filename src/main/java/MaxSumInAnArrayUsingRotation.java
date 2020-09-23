public class MaxSumInAnArrayUsingRotation {
    public static void findInitialSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (i * arr[i]);
        }
        findMaxSum(arr, sum);
    }

    public static void findMaxSum(int[] arr, int maxSum) {
        int currSum = maxSum;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            currSum = currSum + (arr.length-1) * arr[i-1] - (sum-arr[i-1]);
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{20, 2, 10, 1};
        findInitialSum(arr);
    }
}
