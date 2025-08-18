import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			int max = 0;

			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
				max = Math.max(max, A[i]);
			}

			int cnt1 = 0;
			int cnt2 = 0;
			for (int i = 0; i < N; i++) {
				int d = max - A[i];
				cnt1 += d % 2;
				cnt2 += d / 2;
			}

			int min = Integer.MAX_VALUE;
			while (cnt2 >= 0) {
				int x = 0;
				if (cnt1 <= cnt2) {
					x = 2 * cnt2;
				} else {
					x = (2 * cnt1 - 1);
				}
				min = Math.min(min, x);
				cnt2 -= 1;
				cnt1 += 2;

			}

			System.out.println("#" + t + " " + min);
		}
	}
}