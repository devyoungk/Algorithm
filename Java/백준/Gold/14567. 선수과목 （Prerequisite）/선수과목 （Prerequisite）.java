import java.util.*;
import java.io.*;

public class Main {
	static List<Integer>[] A;
	static int[] dp;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		A = new List[N + 1];
		dp = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			A[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			A[b].add(a);
		}

		for (int i = 1; i <= N; i++) {
			System.out.print(count(i) + " ");
		}
	}

	static int count(int n) {
		if (A[n].isEmpty()) {
			return dp[n] = 1;
		}
		if (dp[n] != 0) {
			return dp[n];
		}

		int max = 0;
		for (int x : A[n]) {
			max = Math.max(count(x) + 1, max);
		}
		return dp[n] = max;
	}
}