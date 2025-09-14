import java.util.*;
import java.io.*;

public class Main {
	static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		tc: for (int t = 0; t < T; t++) {
			int l = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int tx = Integer.parseInt(st.nextToken());
			int ty = Integer.parseInt(st.nextToken());

			boolean[][] checked = new boolean[l][l];

			Queue<int[]> Q = new ArrayDeque<>();

			Q.offer(new int[] { x, y, 0 });
			checked[x][y] = true;
			while (!Q.isEmpty()) {
				int[] A = Q.poll();
				int r = A[0];
				int c = A[1];
				int d = A[2];
				if (r == tx && c == ty) {
					System.out.println(d);
					continue tc;
				}
				for (int i = 0; i < 8; i++) {
					int nr = r + dir[i][0];
					int nc = c + dir[i][1];

					if (nr < 0 || nr >= l || nc < 0 || nc >= l || checked[nr][nc])
						continue;

					Q.offer(new int[] { nr, nc, d + 1 });
					checked[nr][nc] = true;
				}
			}
			System.out.println(0);
		}
	}
}
