import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int ans = 0;
	static int[] S, W;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		S = new int[N];
		W = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			S[i] = Integer.parseInt(st.nextToken());
			W[i] = Integer.parseInt(st.nextToken());
		}

		egg(0);

		System.out.println(ans);

	}

	static void egg(int x) {
		if (x == N) {
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (S[i] <= 0) {
					cnt++;
				}
			}
			ans = Math.max(ans, cnt);
			return;
		}

		if (S[x] <= 0) {
			egg(x + 1);
		}
		
		else {
			boolean flag = false;

			for (int i = 0; i < N; i++) {
				if (i == x)
					continue;
				if (S[i] <= 0)
					continue;
				flag = true;
				S[x] -= W[i];
				S[i] -= W[x];
				egg(x + 1);
				S[x] += W[i];
				S[i] += W[x];
			}

			if (!flag)
				egg(N);
		}

	}
}
