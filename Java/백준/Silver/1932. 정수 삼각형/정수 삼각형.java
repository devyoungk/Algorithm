import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] A = new int[N][];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			A[i] = new int[i+1];
			for (int j = 0; j <= i; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] dp = new int[N][];
		
		dp[0] = A[0];
		
		for (int i = 1; i < N; i++) {
			dp[i] = new int[i+1];
			for (int j = 1; j < i; j++) {
				dp[i][j] = A[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
			}
			dp[i][0] = dp[i-1][0] + A[i][0];
			dp[i][i] = dp[i-1][i-1] + A[i][i];
		}
		
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			max = Math.max(max, dp[N-1][i]);
		}
		
		System.out.println(max);
	}
}
