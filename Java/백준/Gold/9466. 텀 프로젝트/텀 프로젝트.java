import java.io.*;
import java.util.*;

public class Main {
	static int[] checked; // 0: 방문 안함, 1: 방문 중(dfs), 2: 방문 완료
	static int[] A;
	static int n, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			n = Integer.parseInt(br.readLine());
			A = new int[n + 1];
			checked = new int[n + 1];

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= n; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			cnt = 0;

			for (int i = 1; i <= n; i++) {
				if (checked[i] == 0) {
					dfs(i);
				}
			}
			System.out.println(n - cnt);
		}
	}

	static void dfs(int cur) {
		checked[cur] = 1;
		
		int next = A[cur];
		
		if (checked[next] == 0) {
			dfs(next);
		} else if (checked[next] == 1) {
			while(next != cur) {
				cnt++;
				next = A[next];
			}
			cnt++;
		}
		checked[cur] = 2;
	}
}
