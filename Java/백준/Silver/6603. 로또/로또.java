import java.io.*;
import java.util.*;

public class Main {
	static int k;
	static int[] A, tmp;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			k = Integer.parseInt(st.nextToken());
			if (k == 0)
				break;

			A = new int[k];
			tmp = new int[6];

			for (int i = 0; i < k; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}

			bt(0);
			sb.append('\n');
		}
		System.out.println(sb);
	}

	static void bt(int n) {
		if (n == 6) {
			for (int i = 0; i < 6; i++) {
				sb.append(tmp[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = 0; i < k; i++) {
			if (n == 0 || tmp[n - 1] < A[i]) {
				tmp[n] = A[i];
				bt(n + 1);
			}
		}

	}
}
