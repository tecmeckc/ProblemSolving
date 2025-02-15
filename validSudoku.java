public class validSudoku {
    public static boolean isValid(char[][] mat, int rows, int cols) {
        // for checking rows and cols
        if (mat[rows][cols] == '.')
            return true;
        for (int x = 0; x < 9; x++) {
            int rn = (int) Math.sqrt(9);
            int sx = ((rows / rn) * rn) + x / 3;
            int sy = ((cols / rn) * rn) + x % 3;
            if (rows != x && mat[x][cols] == mat[rows][cols])
                return false;
            if (cols != x && mat[rows][x] == mat[rows][cols])
                return false;
            if (sx != rows && sy != cols && mat[sx][sy] == mat[rows][cols])
                return false;
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!(isValid(board, i, j)))
                    return false;
            }
        }
        return true;
    }
}
