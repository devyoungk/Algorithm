import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] A = new int[n][m];

		int r0 = -1;
		int c0 = -1;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				if (A[i][j] == 2) {
					r0 = i;
					c0 = j;
				}
			}
		}
		int[][] ans = new int[n][m];
		boolean[][] checked = new boolean[n][m];

		Deque<int[]> Q = new ArrayDeque<>();
		Q.offer(new int[] { r0, c0, 0 });

		int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		while (!Q.isEmpty()) {
			int[] cur = Q.poll();
			int r = cur[0];
			int c = cur[1];
			int d = cur[2];

			ans[r][c] = d;

			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];

				if (nr < 0 || nr >= n || nc < 0 || nc >= m || checked[nr][nc])
					continue;

				if (A[nr][nc] == 1) {
					Q.offer(new int[] { nr, nc, d + 1 });
					checked[nr][nc] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A[i][j] == 1 && !checked[i][j])
					ans[i][j] = -1;
				sb.append(ans[i][j]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}
