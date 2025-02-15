import java.util.HashSet;
import java.util.Set;

public class setMatrixZero {
  public static void display(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void setMZero(int[][] matrix) {
    int n = matrix.length, m = matrix[0].length;
    // set the first row and column as false
    boolean firstRow = false, firstCol = false;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        // we are traversing through the whole matrix and if there is a zero then
        // replace the firstRow and FirstCol as true and set it as zero
        if (matrix[i][j] == 0) {
          if (i == 0)
            firstRow = true;
          if (j == 0)
            firstCol = true;
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
    // set the places in the matrix as zero other than the firstrow and firstColumn
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (matrix[0][j] == 0 || matrix[i][0] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    // setting other elements of first row as zero if any element in the first row
    // is zero
    if (firstRow) {
      for (int j = 0; j < m; j++) {
        matrix[0][j] = 0;
      }
    }
    // setting other elements of first column as zero if any element in the first
    // column is zero
    if (firstCol) {
      for (int i = 0; i < n; i++) {
        matrix[i][0] = 0;
      }
    }

  }

  public static void main(String[] args) {
    int[][] A = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    setMZero(A);
    display(A);
  }
}
