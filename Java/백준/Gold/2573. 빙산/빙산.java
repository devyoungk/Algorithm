import java.util.*;
import java.io.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int N, M;
	static int[][] A;
	static Deque<int[]> Q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		A = new int[N][M];

		Q = new ArrayDeque<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				if (A[i][j] != 0) {
					Q.offer(new int[] { i, j });
				}
			}
		}

		int ans = 0;

		while (!Q.isEmpty()) {
			ans++;
			A = melt1year();
			
			if (isSeparated()) {
				System.out.println(ans);
				return;
			}
		}
		System.out.println(0);
	}
	
	static int[][] melt1year() {
		int[][] next = new int[N][M];
		int l = Q.size();
		for (int i = 0; i < l; i++) {
			int[] cur = Q.poll();
			int r = cur[0];
			int c = cur[1];
			next[r][c] = A[r][c];

			for (int j = 0; j < 4; j++) {
				int nr = r + dir[j][0];
				int nc = c + dir[j][1];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;

				if (A[nr][nc] == 0) {
					next[r][c]--;
				}
			}
			if (next[r][c] <= 0)
				next[r][c] = 0;
			else
				Q.offer(cur);
		}
		return next;
	}

	static boolean isSeparated() {
		boolean[][] checked = new boolean[N][M];
		Deque<int[]> Q = new ArrayDeque<>();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (A[i][j] != 0 && !checked[i][j]) {
					cnt++;
					if (cnt > 1) {
						return true;
					}
					Q.offer(new int[] { i, j });
					checked[i][j] = true;
					while (!Q.isEmpty()) {
						int[] cur = Q.poll();
						int r = cur[0];
						int c = cur[1];
						for (int k = 0; k < 4; k++) {
							int nr = r + dir[k][0];
							int nc = c + dir[k][1];
							if (nr < 0 || nr >= N || nc < 0 || nc >= M || A[nr][nc] == 0 || checked[nr][nc])
								continue;
							Q.offer(new int[] { nr, nc });
							checked[nr][nc] = true;
						}
					}
				}
			}
		}
		return false;
	}
}
