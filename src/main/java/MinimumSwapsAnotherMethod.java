public class MinimumSwapsAnotherMethod {
    static int minimumSwaps(int[] arr, int key) {
        int count = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= key) {
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return count;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
        int key = 3;
        minimumSwaps(arr, key);
        printArray(arr);
    }
}
