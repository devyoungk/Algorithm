import java.io.*;
import java.util.*;

public class Main {
	static int[] A, nums;
	static int N, M;
	static StringBuilder sb;
	static boolean[] checked;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		nums = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nums);

		A = new int[M];
		checked = new boolean[N];
		sb = new StringBuilder();

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

		int prev = -1;
		for (int i = 0; i < N; i++) {
			if (!checked[i] && nums[i] != prev) {
				A[x] = nums[i];
				checked[i] = true;
				backtracking(x + 1);
				checked[i] = false;
				prev = nums[i];
			}
		}
	}
}
