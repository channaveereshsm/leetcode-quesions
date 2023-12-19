import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class rotting_oranges {

    public static int find(int[][] O) {
        int f = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < O.length; i++)
            for (int j = 0; j < O[0].length; j++) {
                if (O[i][j] == 1) {
                    f++;

                }
                if (O[i][j] == 2) {
                    q.add(new int[] { i, j });
                }

            }

        if (f == 0)
            return 0;

        int[] dx = { -1, 0, 0, 1 };
        int[] dy = { 0, -1, 1, 0 };
        int t = 0;
        while (q.size() > 0 && f > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] p = q.poll();
                for (int j = 0; j < 4; j++) {
                    int x = p[0] + dx[j];
                    int y = p[1] + dy[j];
                    if (x < 0 || y < 0 || x >= O.length || y >= O[0].length)
                        continue;
                    if (O[i][j] == 2)
                        continue;
                    O[x][y] = 2;
                    q.add(new int[] { x, y });
                    f--;
                }
            }
            t++;
        }

        if (f > 0)
            return -1;

        return t;

    }

    public static void main(String[] args) {
        int O[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                O[i][j] = sc.nextInt();

        int ans = find(O);
        System.out.println(ans);

    }
}