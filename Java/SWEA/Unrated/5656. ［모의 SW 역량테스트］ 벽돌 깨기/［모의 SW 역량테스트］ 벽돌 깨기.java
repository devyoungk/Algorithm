import java.io.*;
import java.util.*;

class Solution {
	static int min;
	static int N, W, H;
	static boolean[][] checked;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			W = sc.nextInt();
			H = sc.nextInt();

			checked = new boolean[W][H];

			int[][] A = new int[H][W];

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					A[i][j] = sc.nextInt();
				}
			}
			List<List<Integer>> brick = new ArrayList<>();
			for (int j = 0; j < W; j++) {
				List<Integer> L = new LinkedList<>();
				for (int i = 0; i < H; i++) {
					if (A[H - 1 - i][j] == 0) {
						break;
					}
					L.add(A[H - 1 - i][j]);
				}
				brick.add(L);
			}

			min = Integer.MAX_VALUE;

			dfs(0, brick);

			System.out.println("#" + t + " " + min);
		}
	}
	
	public static void check(List<List<Integer>> A, int r, int c) {
		if (r < 0 || r >= W || c < 0 || c >= A.get(r).size() || checked[r][c]) {
			return;
		}
		int x = A.get(r).get(c);
		checked[r][c] = true;

		for (int i = x - 1; i >= 1 - x; i--) {
			if (i == 0) {
				continue;
			}
			check(A, r + i, c);
			check(A, r, c + i);
		}
	}

	static void remove(List<List<Integer>> A) {
		for (int i = 0; i < W; i++) {
			for (int j = H - 1; j >= 0; j--) {
				if (checked[i][j]) {
					A.get(i).remove(j);
				}
			}
		}
		checked = new boolean[W][H];
	}

	static void action(List<List<Integer>> A, int r) {
		int h = A.get(r).size();
		check(A, r, h - 1);
		remove(A);
	}

	static int getScore(List<List<Integer>> A) {
		int sum = 0;
		for (int x = 0; x < W; x++) {
			sum += A.get(x).size();
		}
		return sum;
	}

	static List<List<Integer>> copy(List<List<Integer>> A) {
		List<List<Integer>> copy = new ArrayList<>();
		for (List<Integer> col : A) {
			copy.add(new ArrayList<>(col));
		}
		return copy;
	}

	static void dfs(int d, List<List<Integer>> A) {
		if (d == N) {
			min = Math.min(min, getScore(A));
			return;
		}
		for (int i = 0; i < W; i++) {
			List<List<Integer>> tmp = copy(A);
			action(tmp, i);
			dfs(d + 1, tmp);
		}
	}
}
