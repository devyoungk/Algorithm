import java.io.*;
import java.util.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] A = new int[N][N];

		for (int i = 0; i < N; i++) {
			String S = br.readLine();
			for (int j = 0; j < N; j++) {
				A[i][j] = S.charAt(j) - '0';
			}
		}

		boolean[][] checked = new boolean[N][N];

		List<Integer> L = new ArrayList<>();

		Deque<int[]> Q = new ArrayDeque<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (A[i][j] == 1 && !checked[i][j]) {
					Q.offer(new int[] { i, j });
					checked[i][j] = true;
					int cnt = 1;
					while (!Q.isEmpty()) {
						int[] cur = Q.poll();
						int r = cur[0];
						int c = cur[1];

						for (int d = 0; d < 4; d++) {
							int nr = r + dir[d][0];
							int nc = c + dir[d][1];

							if (nr < 0 || nr >= N || nc < 0 || nc >= N || checked[nr][nc])
								continue;
							if (A[nr][nc] == 1) {
								Q.offer(new int[] { nr, nc });
								checked[nr][nc] = true;
								cnt++;
							}
						}
					}
					L.add(cnt);
				}
			}
		}
		System.out.println(L.size());
		Collections.sort(L);
		for (int x : L) {
			System.out.println(x);
		}
	}

}
