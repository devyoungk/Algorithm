import java.util.*;

class Solution {
	static int d, m, m3, y, min;
	static int[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			d = sc.nextInt();
			m = sc.nextInt();
			m3 = sc.nextInt();
			y = sc.nextInt();

			A = new int[12];
			for (int i = 0; i < 12; i++) {
				A[i] = sc.nextInt();
			}

			min = Integer.MAX_VALUE;
			sol(0, 0);
			min = Math.min(min, y);
			System.out.println("#" + t + " " + min);
		}
	}

	static void sol(int sum, int x) {
		if (x >= 12) {
			min = Math.min(min, sum);
			return;
		}
		sol(sum + d * A[x], x + 1);
		sol(sum + m, x + 1);
		sol(sum + m3, x + 3);
	}
}
