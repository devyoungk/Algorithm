import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int K = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());

		int[][] A = new int[H][W];
		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		int[][] dirH = { { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }, { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 } };

		boolean[][][] checked = new boolean[K + 1][H][W];
		Deque<int[]> Q = new ArrayDeque<>();
		Q.offer(new int[] { 0, 0, 0, 0 });
		checked[0][0][0] = true;

		while (!Q.isEmpty()) {
			int[] cur = Q.poll();
			int r = cur[0];
			int c = cur[1];
			int d = cur[2];
			int k = cur[3];

			if (r == H - 1 && c == W - 1) {
				System.out.println(d);
				return;
			}

			if (k < K) {
				for (int i = 0; i < 8; i++) {
					int nr = r + dirH[i][0];
					int nc = c + dirH[i][1];
					
					if (nr < 0 || nr >= H || nc < 0 || nc >= W || checked[k + 1][nr][nc] || A[nr][nc] == 1) 
						continue;
					
					Q.offer(new int[] {nr, nc, d + 1, k + 1});
					checked[k + 1][nr][nc] = true;
				}
			}
			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				
				if (nr < 0 || nr >= H || nc < 0 || nc >= W || checked[k][nr][nc] || A[nr][nc] == 1) 
					continue;
				
				Q.offer(new int[] {nr, nc, d + 1, k});
				checked[k][nr][nc] = true;
			}
		}
		System.out.println(-1);
	}
}
