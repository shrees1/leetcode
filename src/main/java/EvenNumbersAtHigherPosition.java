public class EvenNumbersAtHigherPosition {
    static int[] arrangeElements(int arr[]) {
        int count = arr.length-1;
        int temp = 0;
        for (int i = arr.length-1; i>0; i--) {
            if (arr[i] %2== 0) {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count--;
            }
        }
        return arr;
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,9,7,0};
        arrangeElements(arr);
        printArray(arr);
    }
}
