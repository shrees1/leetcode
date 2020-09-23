public class RotationSearchAnotherWay {
    static int search(int arr[], int h, int l, int key) {
        if (l > h) {
            return -1;
        }
        int mid = (l + h) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[l] <= arr[mid] && arr[l] <= key && arr[mid] >= key) {
            return search(arr, mid - 1, l, key);
        }
        return search(arr, h, mid + 1, key);
    }

    public static void main(String[] args) {
        int arr1[] = {5, 6, 7, 8, 9, 10,11,12,13, 1, 2, 3};
        int key = 13;
        int n = arr1.length;
        int p = search(arr1, n - 1, 0, key);
        System.out.print(p);
    }
}
