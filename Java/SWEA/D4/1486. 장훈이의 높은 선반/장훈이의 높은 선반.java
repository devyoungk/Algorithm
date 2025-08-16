import java.util.*;
import java.io.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			int[] A = new int[N];
			int S = 0;

			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
				S += A[i];
			}
			int min = S;

			for (int i = 0; i < 1 << N; i++) {
				int X = 0;
				for (int j = 0; j < N; j++) {
					if ((i & (1 << j)) > 0) {
						X += A[j];
					}
				}
				if (X == B) {
					min = B;
					break;
				} else if (X > B) {
					min = Math.min(X, min);
				}
			}
			System.out.println("#" + t + " " + (min - B));
		}
	}
}