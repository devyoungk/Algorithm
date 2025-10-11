import java.util.*;
import java.io.*;

public class Main {
	static char[][] C = new char[5][5];
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int cnt = 0;
	static int[] selected = new int[7];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			String S = br.readLine();
			for (int j = 0; j < 5; j++) {
				C[i][j] = S.charAt(j);
			}
		}

		bt(0, 0, 0);

		System.out.println(cnt);
	}

	static void bt(int n, int idx, int Y) {
		if (Y > 3)
			return;
		if (n == 7) {
			if (isConnected())
				cnt++;
			return;
		}

		for (int i = idx; i < 25; i++) {
			int r = i / 5;
			int c = i % 5;
			selected[n] = i;
			bt(n + 1, i + 1, Y + (C[r][c] == 'Y' ? 1 : 0));
		}
	}

	static boolean isConnected() {
		boolean[][] visited = new boolean[5][5];
		Queue<Integer> Q = new ArrayDeque<>();
		Q.add(selected[0]);
		int r0 = selected[0] / 5;
		int c0 = selected[0] % 5;
		visited[r0][c0] = true;

		int cnt = 1;

		while (!Q.isEmpty()) {
			int cur = Q.poll();
			int r = cur / 5;
			int c = cur % 5;

			for (int d = 0; d < 4; d++) {
				int nr = r + dir[d][0];
				int nc = c + dir[d][1];

				if (nr < 0 || nr >= 5 || nc < 0 || nc >= 5 || visited[nr][nc])
					continue;

				int next = nr * 5 + nc;

				for (int s : selected) {
					if (s == next) {
						visited[nr][nc] = true;
						cnt++;
						Q.add(next);
					}
				}
			}
		}

		return cnt == 7;
	}
}
