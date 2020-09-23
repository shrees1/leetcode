import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int i = 0;
        int row = 0;
        int column = 0;
        List<Integer> spiralList = new ArrayList<>();
        if (matrix.length > 0) {
            row = matrix.length;
            column = matrix[0].length;//3
        }
        while (row <= column) {
            if (matrix.length == 1 && matrix[0].length == 1) {
                spiralList.add(matrix[0][0]);
                return spiralList;
            }
            for (int j = 0; j < column; j++) {
                spiralList.add(matrix[i][j]);
            }
            int j = column - 1;
            for (i = 1; i < row; i++) {
                spiralList.add(matrix[i][j]);
            }
            int k = row - 1;
            for (int l = column - 2; l >= 0; l--) {
                spiralList.add(matrix[k][l]);
            }
            int l = 1;
            for (int m = 0; m < column - 1; m++) {
                spiralList.add(matrix[l][m]);
            }

        }
        return spiralList;
    }

    public static void main(String[] args) {
        int matrix[][] =  { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        List<Integer> spList = spiralOrder(matrix);
        System.out.println(spList);
    }
}
