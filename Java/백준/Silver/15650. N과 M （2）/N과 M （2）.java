import java.io.*;
import java.util.*;

public class Main {
	static int[] A;
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		A = new int[M];

		backtracking(0);
	}

	static void backtracking(int x) {
		if (x == M) {
			for (int a : A) {
				System.out.print(a + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (x == 0 || A[x - 1] < i) {
				A[x] = i;
				backtracking(x + 1);
			}
		}
	}
}
