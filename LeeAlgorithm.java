import java.util.LinkedList;
import java.util.Queue;

class Node {
int x, y, distance;
Node(int x, int y, int dist) {
    this.x = x;
    this.y = y;
    this.distance = dist;
}
    
}

class LeeAlgorithm {
    //this should be the row and column length of the matrix entered
    static int M = 5;
    static int N = 5;

    static boolean isValid(int[][] mat, boolean[][] visited, int row, int col) {
        return ((row >=0) & ((row < M) && ((col>=0) && (col < N)) && (mat[row][col] == 0) && !visited[row][col])); //или mat[row][col] == 1?    
    }

    private static void bfs(int[][] matrix, int sourceX, int sourceY, int targetX, int targetY) {
        int[] row = new int[] {-1, 0, 0, 1};
        int[] col = new int[] {0, -1, 1, 0};

        int minimum_distance = Integer.MAX_VALUE;
        boolean[][] visited = new boolean[M][N];
        visited[sourceX][sourceY] = true;
        

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(sourceX, sourceY, 0));
        while (!q.isEmpty()) {
            Node currentNode = q.poll();
            if (currentNode.x == targetX && currentNode.y == targetY) {
            minimum_distance = currentNode.distance;
            break;
        }
        
        for (int k = 0; k < 4; k++) {
            int newX = currentNode.x + row[k];
            int newY = currentNode.y + col[k];
            if (isValid(matrix, visited, newX, newY)) {
                visited[newX][newY] = true;
                Node n = new Node(newX, newY, currentNode.distance + 1);
                q.add(n);
            }
        }
    }

    if (minimum_distance == Integer.MAX_VALUE) {
        System.out.println("Destination cannot be reqched");
    } else {
        System.out.println("The shortest path has length " + minimum_distance);
    }
}

public static void main(String[] args) {
    int[][] matrix = 
    {
        {1, 0, 1, 1, 1},
        {1, 0, 1, 0, 1},
        {1, 1, 1, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 0, 1},
        {1, 1, 0, 0, 0},
    };
    bfs(matrix, 0, 0, 3, 4);
}

}
/*TODO: Завтра найду и  исправлю этот баг
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6        at LeeAlgorithm.isValid(LeeAlgorithm.java:20)
        at LeeAlgorithm.bfs(LeeAlgorithm.java:44)
        at LeeAlgorithm.main(LeeAlgorithm.java:69)
 */