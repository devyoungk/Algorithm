import java.util.*;
import java.io.*;

public class Main {
	static int N, M, cnt;
	static char[][] A;
	static boolean[][] checked;
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int c0 = -1;
		int r0 = -1;
		A = new char[N][M];
		checked = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String S = sc.next();
			for (int j = 0; j < M; j++) {
				A[i][j] = S.charAt(j);
				if (A[i][j] == 'I') {
					r0 = i;
					c0 = j;
				}
			}
		}
		cnt = 0;
		sol(r0, c0);
		if (cnt == 0) {
			System.out.println("TT");
		} else {
			System.out.println(cnt);
		}
	}

	static void sol(int r, int c) {
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] { r, c });

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int cr = cur[0];
			int cc = cur[1];
			if (A[cr][cc] == 'P') {
				cnt++;
			}

			for (int i = 0; i < 4; i++) {
				int nr = cr + dir[i][0];
				int nc = cc + dir[i][1];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (checked[nr][nc] || A[nr][nc] == 'X') {
					continue;
				}
				checked[nr][nc] = true;
				q.offer(new int[] { nr, nc });
			}
		}
	}
}