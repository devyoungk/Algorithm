import java.io.*;
import java.util.*;

public class Main {
	static int[] A;
	static int N, M;
	static StringBuilder sb = new StringBuilder();
	static boolean[] checked;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		A = new int[M];
		checked = new boolean[N + 1];

		backtracking(0);
		
		System.out.println(sb);
	}

	static void backtracking(int x) {
		if (x == M) {
			for (int a : A) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!checked[i]) {
				A[x] = i;
				checked[i] = true;
				backtracking(x + 1);
				checked[i] = false;
			}
		}
	}
}
