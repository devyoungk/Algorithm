import java.util.*;

public class Solution {
	static int[][] dir = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			char[][] C = new char[N][N];
			for (int i = 0; i < N; i++) {
				String S = sc.next();
				for (int j = 0; j < N; j++) {
					C[i][j] = S.charAt(j);
				}
			}

			int[][] A = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (C[i][j] == '*') {
						A[i][j] = -1;
						continue;
					}
					int cnt = 0;
					for (int k = 0; k < 8; k++) {
						int r = i + dir[k][0];
						int c = j + dir[k][1];
						if (r < 0 || r >= N || c < 0 || c >= N) {
							continue;
						}
						if (C[r][c] == '*')
							cnt++;
					}
					A[i][j] = cnt;
				}
			}
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (A[i][j] == 0) {
						Queue<int[]> Q = new ArrayDeque<>();
						Q.offer(new int[] { i, j });
						A[i][j] = -1;
						while (!Q.isEmpty()) {
							int[] X = Q.poll();
							int r = X[0];
							int c = X[1];
							for (int k = 0; k < 8; k++) {
								int nr = r + dir[k][0];
								int nc = c + dir[k][1];
								if (nr < 0 || nr >= N || nc < 0 || nc >= N || A[nr][nc] == -1) {
									continue;
								}
								if (A[nr][nc] == 0) {
									Q.offer(new int[] { nr, nc });
								}
								A[nr][nc] = -1;
							}
						}
						cnt++;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (A[i][j] != -1)
						cnt++;
				}
			}
			System.out.println("#" + t + " " + cnt);
		}
	}
}
