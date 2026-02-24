import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		List<Integer> A = new ArrayList<>();
		while (true) {
			int N = Integer.parseInt(st.nextToken());
			if (N == 0)
				break;
			A.add(N);
		}

		int l = A.size();

		int[][][] dp = new int[l + 1][5][5];

		int INF = 1000000000;
		for (int i = 0; i <= l; i++) {
			for (int a = 0; a < 5; a++) {
				Arrays.fill(dp[i][a], INF);
			}
		}
		dp[0][0][0] = 0;

		for (int i = 0; i < l; i++) {
			int x = A.get(i);
			for (int L = 0; L < 5; L++) {
				for (int R = 0; R < 5; R++) {
					int cur = dp[i][L][R];

					dp[i + 1][x][R] = Math.min(dp[i + 1][x][R], cur + cost(L, x));
					dp[i + 1][L][x] = Math.min(dp[i + 1][L][x], cur + cost(R, x));
				}
			}
		}

		int ans = INF;
		for (int L = 0; L < 5; L++) {
			for (int R = 0; R < 5; R++) {
				ans = Math.min(ans, dp[l][L][R]);
			}
		}

		System.out.println(ans);
	}

	static int cost(int now, int next) {
		if (now == 0) return 2;
		if (now == next) return 1;
		if (Math.abs(next - now) == 2) return 4;
		return 3;

	}
}
