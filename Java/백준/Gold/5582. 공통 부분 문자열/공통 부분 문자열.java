import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();

		char[] A = a.toCharArray();
		char[] B = b.toCharArray();

		int[][] dp = new int[A.length + 1][B.length + 1];

		int ans = 0;

		for (int i = 1; i <= A.length; i++) {
			for (int j = 1; j <= B.length; j++) {
				if (A[i - 1] == B[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					ans = Math.max(ans, dp[i][j]);
				} else
					dp[i][j] = 0;
			}
		}
		System.out.println(ans);
	}

}
