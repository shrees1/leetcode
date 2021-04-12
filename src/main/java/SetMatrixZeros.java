import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

  public static void setZeroes(int[][] matrix) {
    int rowL = matrix.length;
    int colL = matrix[0].length;
    Set<Integer> aSetI = new HashSet<Integer>();
    Set<Integer> aSetJ = new HashSet<Integer>();
    for (int i = 0; i < rowL; i++) {
      for (int j = 0; j < colL; j++) {
        if (matrix[i][j] == 0) {
          aSetI.add(i);
          aSetJ.add(j);
        }
      }
    }
    for (int i = 0; i < rowL; i++) {
      for (int j = 0; j < colL; j++) {

      }
    }
  }
}


