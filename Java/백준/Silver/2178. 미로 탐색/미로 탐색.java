import java.util.*;
import java.io.*;

public class Main {
	static int N, M, min;
	static int[][] A;
	static int[][] D;
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		A = new int[N + 2][M + 2];
		D = new int[N + 2][M + 2];
		for (int i = 1; i <= N; i++) {
			String S = sc.next();
			for (int j = 1; j <= M; j++) {
				A[i][j] = S.charAt(j - 1) - '0';
			}
		}
		sol(1, 1);
		System.out.println(D[N][M]);
	}

	static void sol(int r, int c) {
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] { r, c });
		D[r][c] = 1;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int cr = cur[0];
			int cc = cur[1];

			for (int i = 0; i < 4; i++) {
				int nr = cr + dir[i][0];
				int nc = cc + dir[i][1];

				if (A[nr][nc] == 0 || D[nr][nc] != 0)
					continue;

				D[nr][nc] = D[cr][cc] + 1;
				q.offer(new int[] { nr, nc });
			}
		}
	}
}