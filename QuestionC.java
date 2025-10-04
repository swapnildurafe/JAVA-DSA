import java.util.*;

public class QuestionC {
    static int M, N;
    static char[][] grid;

    // directions: 0=up,1=right,2=down,3=left
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        grid = new char[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int maxLoop = 0;
        // try starting from every cell with every direction
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] != '0') {
                    for (int d = 0; d < 4; d++) {
                        maxLoop = Math.max(maxLoop, simulate(i, j, d));
                    }
                }
            }
        }

        System.out.println(maxLoop);
    }

    static int simulate(int x, int y, int dir) {
        Set<String> visited = new HashSet<>();
        int steps = 0;

        while (true) {
            if (x < 0 || y < 0 || x >= M || y >= N) return 0; // out of bounds
            if (grid[x][y] == '0') return 0; // no mirror

            String state = x + "," + y + "," + dir;
            if (visited.contains(state)) {
                return steps; // loop found
            }
            visited.add(state);
            steps++;

            char mirror = grid[x][y];
            if (mirror == '/') {
                if (dir == 0) dir = 1;
                else if (dir == 1) dir = 0;
                else if (dir == 2) dir = 3;
                else if (dir == 3) dir = 2;
            } else if (mirror == '\\') {
                if (dir == 0) dir = 3;
                else if (dir == 3) dir = 0;
                else if (dir == 1) dir = 2;
                else if (dir == 2) dir = 1;
            }

            x += dx[dir];
            y += dy[dir];
        }
    }
}
