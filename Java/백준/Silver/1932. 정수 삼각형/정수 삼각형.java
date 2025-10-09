import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] A = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			int idx = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				A[i][idx++] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] DP = new int[N][N];
		DP[0][0] = A[0][0];
		
		int ans = DP[0][0];
		
		for (int i = 1; i < N; i++) {
			int idx = 0;
			while (idx <= i) {
				if (idx == 0) {
					DP[i][idx] = DP[i-1][idx] + A[i][idx];
				}
				else {
					DP[i][idx] = Math.max(DP[i-1][idx], DP[i-1][idx - 1]) + A[i][idx];
				}
				ans = Math.max(ans, DP[i][idx]);
				idx++;
			}
		}
		System.out.println(ans);
	}
}
