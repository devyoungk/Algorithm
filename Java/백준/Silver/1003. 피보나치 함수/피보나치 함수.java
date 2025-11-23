import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] dp = new int[41][2];
		dp[0] = new int[] {1, 0};
		dp[1] = new int[] {0, 1};
		
		int T = Integer.parseInt(br.readLine());
		
		int idx = 2;
		
		StringBuilder sb = new StringBuilder();
		
		for (int t = 0; t < T; t++) {
			int x = Integer.parseInt(br.readLine());
			
			if (x >= idx) {
				for (int i = idx; i <= x; i++) {
					dp[i][0] = dp[i-1][0] + dp[i-2][0];
					dp[i][1] = dp[i-1][1] + dp[i-2][1];
				}
				idx = x + 1;
			}
			
			sb.append(dp[x][0]).append(' ').append(dp[x][1]).append('\n');
		}
		System.out.println(sb);
	}
}
