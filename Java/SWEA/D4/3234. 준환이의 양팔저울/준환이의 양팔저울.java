import java.util.*;
import java.io.*;

class Solution {
	static int cnt;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			cnt = 0;
			int sum = 0;

			sol(0, N, A, sum);
			System.out.println("#" + t + " " + cnt);
		}
	}

	static void sol(int d, int N, int[] A, int sum) {
		if (sum < 0) {
			return;
		}
		if (d == N) {
			cnt++;
			return;
		}
		for (int i = 0; i < N; i++) {
			if (A[i] == 0) {
				continue;
			}
			int x = A[i];
			A[i] = 0;
			sol(d + 1, N, A, sum - x);
			sol(d + 1, N, A, sum + x);
			A[i] = x;
		}
	}
}