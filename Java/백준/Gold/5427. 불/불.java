import java.util.*;
import java.io.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		tc: for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			char[][] C = new char[h][w];

			int r0 = -1;
			int c0 = -1;

			Queue<int[]> Q = new ArrayDeque<>();

			for (int i = 0; i < h; i++) {
				String S = br.readLine();
				for (int j = 0; j < w; j++) {
					C[i][j] = S.charAt(j);
					if (C[i][j] == '@') {
						r0 = i;
						c0 = j;
					} else if (C[i][j] == '*') {
						Q.offer(new int[] { i, j, 0, 0 }); // 불
					}
				}
			}
			Q.offer(new int[] { r0, c0, 1, 0 }); // 상근이

			boolean[][] visited = new boolean[h][w];

			while (!Q.isEmpty()) {
				int[] X = Q.poll();
				int r = X[0];
				int c = X[1];
				int z = X[2];
				int d = X[3];
				if (z == 0) {
					for (int i = 0; i < 4; i++) {
						int nr = r + dir[i][0];
						int nc = c + dir[i][1];
						if (nr < 0 || nr >= h || nc < 0 || nc >= w)
							continue;
						if (C[nr][nc] == '#' || C[nr][nc] == '*')
							continue;
						C[nr][nc] = '*';
						Q.offer(new int[] { nr, nc, z, d + 1 });
					}
				} else {
					for (int i = 0; i < 4; i++) {
						int nr = r + dir[i][0];
						int nc = c + dir[i][1];
						if (nr < 0 || nr >= h || nc < 0 || nc >= w) {
							sb.append(d + 1).append("\n");
							continue tc;
						}
						if (visited[nr][nc] || C[nr][nc] == '#' || C[nr][nc] == '*')
							continue;
						C[nr][nc] = '@';
						visited[nr][nc] = true;
						Q.offer(new int[] { nr, nc, z, d + 1 });
					}
				}
			}
			sb.append("IMPOSSIBLE\n");
		}
		System.out.println(sb);
	}
}
