import java.util.*;
import java.io.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int[][] A = new int[M][N];

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				A[X][Y] = 1;
			}

			boolean[][] checked = new boolean[M][N];

			Queue<int[]> Q = new ArrayDeque<>();

			int ans = 0;

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (A[i][j] == 0 || checked[i][j])
						continue;
					Q.offer(new int[] { i, j });
					checked[i][j] = true;
					while (!Q.isEmpty()) {
						int[] cur = Q.poll();
						for (int d = 0; d < 4; d++) {
							int nr = cur[0] + dir[d][0];
							int nc = cur[1] + dir[d][1];
							if (nr < 0 || nr >= M || nc < 0 || nc >= N || checked[nr][nc])
								continue;
							if (A[nr][nc] == 1) {
								Q.offer(new int[] { nr, nc });
								checked[nr][nc] = true;
							}
						}
					}
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
