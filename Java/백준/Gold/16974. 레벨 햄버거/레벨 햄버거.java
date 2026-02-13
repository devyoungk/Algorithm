import java.util.*;
import java.io.*;

public class Main {
	static long[] L, P;
	static long ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		long X = Long.parseLong(st.nextToken());

		L = new long[N + 1];
		P = new long[N + 1];

		L[0] = 1;
		P[0] = 1;
		ans = 0;

		for (int i = 1; i <= N; i++) {
			L[i] = 2 * L[i - 1] + 3;
			P[i] = 2 * P[i - 1] + 1;
		}

		sol(N, X);

		System.out.println(ans);
	}

	static void sol(int n, long x) {
		if (x <= 0)
			return;

		if (n == 0) {
			ans += 1;
			return;
		}

		if (x == 1)
			return;

		if (x >= L[n]) {
			ans += P[n];
			return;
		}

		if (x == L[n] / 2 + 1) {
			ans += P[n - 1] + 1;
		} else if (x > L[n] / 2 + 1) {
			ans += P[n - 1] + 1;
			sol(n - 1, x - L[n - 1] - 2);
		} else {
			sol(n - 1, x - 1);
		}
	}
}
