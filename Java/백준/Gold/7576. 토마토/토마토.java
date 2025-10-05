import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[][] tomato = new int[N][M];

		Deque<int[]> Q = new ArrayDeque<>();

		int cnt = 0; // 아직 안익은 토마토

		for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
				if (tomato[i][j] == 1) {
					Q.offer(new int[] { i, j, 1 });
				} else if (tomato[i][j] == 0) {
					cnt++;
				}
			}
		}

		if (cnt == 0) {
			System.out.println(0);
			return;
		}

		int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 }};

		while (!Q.isEmpty()) {
			int[] X = Q.poll();

			int r = X[0];
			int c = X[1];
			int d = X[2];

			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M) {
					continue;
				}
				if (tomato[nr][nc] == -1) {
					continue;
				}

				if (tomato[nr][nc] == 0) {
					tomato[nr][nc] = 1;
					cnt--;
					if (cnt == 0) {
						System.out.println(d);
						return;
					}
					Q.offer(new int[] { nr, nc, d + 1 });
				}
			}
		}
		System.out.println(-1);
	}
}
