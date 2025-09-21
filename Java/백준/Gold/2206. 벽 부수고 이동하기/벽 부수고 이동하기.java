import java.io.*;
import java.util.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] A = new int[N][M];

		for (int i = 0; i < N; i++) {
			String S = br.readLine();
			for (int j = 0; j < M; j++) {
				A[i][j] = S.charAt(j) - '0';
			}
		}

		boolean[][][] checked = new boolean[2][N][M];

		Deque<int[]> Q = new ArrayDeque<>();

		Q.offer(new int[] { 0, 0, 1, 0 }); // 행, 열, 거리, 벽 부셨는지
		checked[0][0][0] = true;

		while (!Q.isEmpty()) {
			int[] cur = Q.poll();
			int r = cur[0];
			int c = cur[1];
			int d = cur[2];
			int b = cur[3];
			
			if (r == N - 1 && c == M - 1) {
				System.out.println(d);
				return;
			}

			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M || checked[b][nr][nc])
					continue;
				
				if (A[nr][nc] == 1) {
					if (b == 0 && !checked[1][nr][nc]) {
						Q.offer(new int[] {nr, nc, d + 1, 1});
						checked[1][nr][nc] = true;
					}
				}
				else {
					Q.offer(new int[] {nr, nc, d + 1, b});
					checked[b][nr][nc] = true;
				}
			}
		}
		System.out.println(-1);
	}
}
