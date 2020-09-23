public class MinSwapsUsingPointer {
    static int findMinSwaps(int[] arr, int key) {
        int n = arr.length;
        int i = 0, j = n - 1;
        int temp = 0, swapCount = 0;
        while (i < n && j > 0) {
            if (arr[i] <= key) {
                i++;
            }
            if (arr[j] > key) {
                j--;
            }
            if (arr[i] > key && arr[j] <= key) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swapCount++;
            }
            if (j<=i) {
                break;
            }
        }
        return swapCount-1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 5, 8, 7, 4};
        int key = 5;
        int result = findMinSwaps(arr, key);
        System.out.print(result);
    }

}
