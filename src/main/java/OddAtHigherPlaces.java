import java.util.Arrays;

public class OddAtHigherPlaces {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Rearrage(int[] arr, int n) {
        for (int i = 0; i < n - 1; i = i + 2) {
            if (arr[i] > arr[i + 1])
                swap(arr, i, i + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 1, 9, 3};
        int n = arr.length;
        Rearrage(arr, n);
        System.out.println(Arrays.toString(arr));

    }
}
