import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int H = sc.nextInt();

		int[][][] tomato = new int[H][M][N];

		Deque<int[]> Q = new ArrayDeque<>();

		int cnt = 0; // 아직 안익은 토마토

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					tomato[i][j][k] = sc.nextInt();
					if (tomato[i][j][k] == 1) {
						Q.push(new int[] { i, j, k, 1 });
					} else if (tomato[i][j][k] == 0) {
						cnt++;
					}
				}
			}
		}

		if (cnt == 0) {
			System.out.println(0);
			return;
		}

		int[][] dir = { { -1, 0, 0 }, { 1, 0, 0 }, { 0, -1, 0 }, { 0, 1, 0 }, { 0, 0, -1 }, { 0, 0, 1 } };

		while (!Q.isEmpty()) {
			int[] X = Q.poll();

			int h = X[0];
			int r = X[1];
			int c = X[2];
			int d = X[3];

			for (int i = 0; i < 6; i++) {
				int nh = h + dir[i][0];
				int nr = r + dir[i][1];
				int nc = c + dir[i][2];

				if (nh < 0 || nh >= H || nr < 0 || nr >= M || nc < 0 || nc >= N) {
					continue;
				}
				if (tomato[nh][nr][nc] == -1) {
					continue;
				}

				if (tomato[nh][nr][nc] == 0) {
					tomato[nh][nr][nc] = 1;
					cnt--;
					if (cnt == 0) {
						System.out.println(d);
						return;
					}
					Q.offer(new int[] { nh, nr, nc, d + 1 });
				}
			}
		}
		System.out.println(-1);
	}
}
