import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int[][] matrix = 
        {
            {1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1},
            {1, 1, 0, 0, 0},
        };
        LeeAlgorithm.bfs(matrix, 0, 0, 3, 4); //The shortest path has length 7
}

}