import java.util.*;

public class Solution {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		next: for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t).append(" ");

			char[][] map = new char[N][M];

			Queue<int[]> Q = new ArrayDeque<>();
			int[] sy = new int[4];

			for (int i = 0; i < N; i++) {
				String S = sc.next();
				for (int j = 0; j < M; j++) {
					map[i][j] = S.charAt(j);
					if (map[i][j] == 'S') {
						sy = new int[] { i, j, 1, 0 };
					} else if (map[i][j] == '*') {
						Q.offer(new int[] { i, j, 0, 0 });
					}
				}
			}
			Q.offer(sy);

			while (!Q.isEmpty()) {
				int[] X = Q.poll();
				int r = X[0];
				int c = X[1];
				for (int i = 0; i < 4; i++) {
					int nr = r + dir[i][0];
					int nc = c + dir[i][1];
					if (nr < 0 || nr >= N || nc < 0 || nc >= M || map[nr][nc] == '*' || map[nr][nc] == 'X') {
						continue;
					}
					if (X[2] == 0) {
						if (map[nr][nc] == 'D') {
							continue;
						}
						map[nr][nc] = '*';
						Q.offer(new int[] { nr, nc, 0, X[3] + 1 });
					} else {
						if (map[nr][nc] == 'D') {
							sb.append(X[3] + 1);
							System.out.println(sb);
							continue next;
						} else if (map[nr][nc] == 'S') {
							continue;
						}
						map[nr][nc] = 'S';
						Q.offer(new int[] { nr, nc, 1, X[3] + 1 });
					}
				}
			}
			sb.append("GAME OVER");
			System.out.println(sb);
		}
	}
}