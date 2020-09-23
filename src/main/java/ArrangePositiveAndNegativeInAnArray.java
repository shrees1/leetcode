public class ArrangePositiveAndNegativeInAnArray {
    static int[] arrangeElements(int arr[]) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[]={-1,-2,-3,9,0,-8,7,6,5};
        arrangeElements(arr);
        printArray(arr);
    }
}
