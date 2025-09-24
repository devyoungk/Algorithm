import java.util.*;
import java.io.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[][] A = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] map = new int[N][N];
		boolean[][] checked = new boolean[N][N];

		Deque<int[]> S = new ArrayDeque<>();
		int x = 1; 

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (A[i][j] == 1 && !checked[i][j]) {
					S.push(new int[] { i, j });
					checked[i][j] = true;
					while (!S.isEmpty()) {
						int[] cur = S.pop();
						int r = cur[0];
						int c = cur[1];
						map[r][c] = x;

						for (int k = 0; k < 4; k++) {
							int nr = r + dir[k][0];
							int nc = c + dir[k][1];

							if (nr < 0 || nr >= N || nc < 0 || nc >= N || checked[nr][nc] || A[nr][nc] == 0)
								continue;
							S.push(new int[] { nr, nc });
							checked[nr][nc] = true; 
						}
					}
					x++; 
				}
			}
		}
		int ans = Integer.MAX_VALUE;


		next: for (int island = 1; island <= x; island++) {
			boolean[][] visited = new boolean[N][N];
			Deque<int[]> Q = new ArrayDeque<>();

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == island) {
						for (int d = 0; d < 4; d++) {
							int nr = i + dir[d][0];
							int nc = j + dir[d][1];
							if (nr < 0 || nr >= N || nc < 0 || nc >= N)
								continue;
							if (map[nr][nc] == 0 && !visited[i][j]) {
								Q.offer(new int[] { i, j, 0 });
								visited[i][j] = true;
								break;
							}
						}
					}
				}
			}
			while (!Q.isEmpty()) {
				int[] cur = Q.poll();
				int r = cur[0];
				int c = cur[1];
				int d = cur[2];

				for (int i = 0; i < 4; i++) {
					int nr = r + dir[i][0];
					int nc = c + dir[i][1];

					if (nr < 0 || nr >= N || nc < 0 || nc >= N)
						continue;

					if (map[nr][nc] != island && map[nr][nc] != 0) {
						ans = Math.min(ans, d);
						continue next;
					}

					if (map[nr][nc] == 0 && !visited[nr][nc]) {
						Q.offer(new int[] { nr, nc, d + 1 });
						visited[nr][nc] = true;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
