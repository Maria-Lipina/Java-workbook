public class Queens {

    public static void positions(int[][] board) {
        
        if (!place(board, 0)) {
            System.out.println("решения нет");
            return;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static boolean checkPosition(int[][] board, int row, int column) {
        for (int i = 0; i < column; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        // налево наверх
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // налево вниз
        for (int i = row + 1, j = column - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean place(int[][] board, int col) {
        if (col >= board.length) {
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            if (checkPosition(board, i, col)) {
                // ставим ферзя
                board[i][col] = 1;

                if (place(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0;
            }
        }
        return false;
    }

}
