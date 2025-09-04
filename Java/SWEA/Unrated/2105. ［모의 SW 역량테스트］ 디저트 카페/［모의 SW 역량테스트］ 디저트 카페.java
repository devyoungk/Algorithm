import java.util.*;

class Solution {
	static int[][] dir = { { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, 1 } };
	static int[][] A;
	static int N, max;
	static Set<Integer> check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			A = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			max = -1;
			
			for (int i = 0; i < N - 2; i++) {
				for (int j = 1; j < N - 1; j++) {
					check = new HashSet<>();
					check.add(A[i][j]);
					sol(i, j, 0, 0, 0, 0);
				}
			}
			System.out.println("#" + t + " " + max);
		}
	}

	static void sol(int r, int c, int d, int t, int l1, int l2) { // r : 열, c : 행, d : 지나온 카페, t : 회전 횟수, l1, l2 : 직진 횟수)														
		if (d == 0) {
			int nr = r + dir[0][0];
			int nc = c + dir[0][1];
			if (!check.contains(A[nr][nc])) {
				check.add(A[nr][nc]);
				sol(nr, nc, d + 1, t, l1 + 1, l2);
				check.remove(A[nr][nc]);
			}
		}
		else if (t == 0) {
			int nr = r + dir[0][0];
			int nc = c + dir[0][1];
			if (nr < N && nc < N) {
				if (!check.contains(A[nr][nc])) {
					check.add(A[nr][nc]);
					sol(nr, nc, d + 1, t, l1 + 1, l2);
					check.remove(A[nr][nc]);
				}
			}
			
			nr = r + dir[1][0];
			nc = c + dir[1][1];
			if (nr < N && nc >= 0) {
				if (!check.contains(A[nr][nc])) {
					check.add(A[nr][nc]);
					sol(nr, nc, d + 1, t + 1, l1, l2 + 1);
					check.remove(A[nr][nc]);
				}
			}
			
		}
		else if (t == 1) {
			int nr = r + dir[1][0];
			int nc = c + dir[1][1];
			if (nr < N && nc >= 0) {
				if (!check.contains(A[nr][nc])) {
					check.add(A[nr][nc]);
					sol(nr, nc, d + 1, t, l1, l2 + 1);
					check.remove(A[nr][nc]);
				}
			}
			nr = r + dir[2][0];
			nc = c + dir[2][1];
			if (nr >= 0 && nc >= 0) {
				if (!check.contains(A[nr][nc])) {
					check.add(A[nr][nc]);
					sol(nr, nc, d + 1, t + 1, l1, l2);
					check.remove(A[nr][nc]);
				}
			}
		}
		
		else if (t == 2) {
			Set<Integer> tempCheck = new HashSet<>(check);
			for (int i = 0; i < l1 - 1; i++) {
				int nr = r + dir[2][0];
				int nc = c + dir[2][1];
				if (nr < 0 || nc < 0) {
					return;
				}
				if (tempCheck.contains(A[nr][nc])) {
					return;
				}
				tempCheck.add(A[nr][nc]);
				r = nr;
				c = nc;
			}
			for (int i = 0; i < l2 - 1; i++) {
				int nr = r + dir[3][0];
				int nc = c + dir[3][1];
				if (tempCheck.contains(A[nr][nc])) {
					return;
				}
				tempCheck.add(A[nr][nc]);
				r = nr;
				c = nc;
			}
			max = Math.max(max, tempCheck.size());
		}
	}
}