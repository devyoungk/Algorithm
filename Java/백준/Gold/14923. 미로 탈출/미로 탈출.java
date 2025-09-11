import java.util.*;
import java.io.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int Hx = Integer.parseInt(st.nextToken()) - 1;
		int Hy = Integer.parseInt(st.nextToken()) - 1;
		st = new StringTokenizer(br.readLine());
		int Ex = Integer.parseInt(st.nextToken()) - 1;
		int Ey = Integer.parseInt(st.nextToken()) - 1;

		int[][] A = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Queue<int[]> Q = new ArrayDeque<>();
		Q.offer(new int[] { Hx, Hy, 0, 0 });

		boolean[][][] visited = new boolean[N][M][2];
		visited[Hx][Hy][0] = true;
		

		while (!Q.isEmpty()) {
			int[] X = Q.poll();
			int r = X[0];
			int c = X[1];
			int b = X[2];
			int d = X[3];

			if (r == Ex && c == Ey) {
				System.out.println(d);
				return;
			}

			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				if (nr < 0 || nr >= N || nc < 0 || nc >= M || visited[nr][nc][b])
					continue;
				if (A[nr][nc] == 1) {
					if (b == 0 && !visited[nr][nc][1]) {
						Q.offer(new int[] { nr, nc, 1, d + 1 });
						visited[nr][nc][1] = true;
					} else {
						continue;
					}
				} else {
					Q.offer(new int[] { nr, nc, b, d + 1 });
					visited[nr][nc][b] = true;
				}
			}
		}
		System.out.println(-1);
	}
}
