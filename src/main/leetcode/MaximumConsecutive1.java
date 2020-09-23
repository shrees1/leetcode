public class MaximumConsecutive1 {
    public static int findIndex(int[] A, int res, int K) {
        int count0 = 0;
        int i = 0;
        for (i = res; i < A.length; i++) {
            if (A[i] == 0) {
                count0 += 1;
            }
            if (count0 == K || i == A.length) {
                break;
            }
        }
        return i;
    }

    public static int longestOnes(int[] A, int K) {
        int result = 0;
        int count = 0;
        int backup = 0;
        int res = findIndex(A, result+1, K);
        count += 1;

        if (count == 1) {
            backup = (res - backup) + 1;
        }
        else if (res - backup > backup) {
            backup = (res - backup) + 1;
        }
        if (res < A.length) {
            findIndex(A, res, K);
        }
        return backup;
    }

    public static void main(String[] args) {
        int result = longestOnes(new int[]{0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0}, 2);
        System.out.println(result);
    }
}
