package example.OneClassTasks;

public class Knights {

    private static int[][] board;
    private static int[][] moves;
    private static int maxMoves;

    public static void moveThem(int boardSize) {
        board = new int[boardSize][boardSize];
        maxMoves = board.length * board[0].length;
        moves = new int[][] { { -2, 1 }, { -2, -1 }, { 2, 1 }, { -2, -1 }, { -1, 2 }, { -1, -2 }, { 1, 2 }, { 1, -2 } };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (findPath(i, j, 1)) {
                    printSol();
                    // return;
                    System.out.println("-----");
                    board = new int[boardSize][boardSize];
                }
            }
        }
        System.out.println("Решений нет");
    }

    private static boolean findPath(int curX, int curY, int moveNum) {
        board[curX][curY] = moveNum; // запомнить ход
        if (moveNum >= maxMoves) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int nextX = curX + moves[i][0];
            int nextY = curY + moves[i][1];
            if (isPossibleMove(nextX, nextY) && findPath(nextX, nextY, moveNum + 1)) {
                return true;
            }
        }
        board[curX][curY] = 0;
        return false;
    }

    private static boolean isPossibleMove(int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board.length && board[x][y] == 0;
    }

    private static void printSol() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
        System.out.println();
        }
    }

}
