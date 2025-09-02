import java.util.*;

public class Main {
	static int N;
	static int[][] A;
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 1;

		while (true) {
			N = sc.nextInt();
			if (N == 0) {
				break;
			}
			A = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			System.out.println("Problem " + t++ + ": " + dijkstra());
		}
	}

	static int dijkstra() {
		PriorityQueue<int[]> Q = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[2], o2[2]));

		int[][] S = new int[N][N]; // 가중치 배열
		for (int i = 0; i < N; i++) {
			Arrays.fill(S[i], Integer.MAX_VALUE);
		}
		Q.offer(new int[] { 0, 0, A[0][0] });
		S[0][0] = A[0][0];

		while (!Q.isEmpty()) {
			int[] tmp = Q.poll();
			int r = tmp[0];
			int c = tmp[1];

			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				if (nr < 0 || nr >= N || nc < 0 || nc >= N) {
					continue;
				}
				if (S[nr][nc] > S[r][c] + A[nr][nc]) {
					S[nr][nc] = S[r][c] + A[nr][nc];
					Q.offer(new int[] { nr, nc, A[nr][nc] });
				}
			}
		}
		return S[N - 1][N - 1];
	}
}
