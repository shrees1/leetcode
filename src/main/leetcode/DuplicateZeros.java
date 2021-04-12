public class DuplicateZeros {

  public static void duplicateZeros(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == 0) {
        modifyArray(arr, i+1);
        i++;
      }
    }
  }

  public static void modifyArray(int[] arr, int i) {
    for (int j = arr.length-1; j >i; j--) {
      arr[j]=arr[j-1];
    }
    arr[i] =0;
  }

  public static void main(String[] args) {
    duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
  }
}
