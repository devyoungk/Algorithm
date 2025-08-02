import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();

		int[] A = new int[N];
		int cnt = 0;
		A[0] += 1;
		int idx = 0;

		while (A[idx] < M) {
			if (A[idx] % 2 == 1) {
				idx += L;
			} else {
				idx -= L;
			}
			if (idx >= N) {
				idx -= N;
			} else if (idx < 0) {
				idx += N;
			}
			A[idx] += 1;
			cnt++;
		}
		System.out.println(cnt);
	}
}