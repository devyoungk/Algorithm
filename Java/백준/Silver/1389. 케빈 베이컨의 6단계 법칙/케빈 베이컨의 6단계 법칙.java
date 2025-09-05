import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		List<Integer>[] graph = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}

		int min = Integer.MAX_VALUE;
		int who = 0;

		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			boolean[] checked = new boolean[N + 1];
			Queue<int[]> Q = new ArrayDeque<>();
			Q.offer(new int[] { i, 0 });
			checked[i] = true;
			while (!Q.isEmpty()) {
				int[] tmp = Q.poll();
				int x = tmp[0];
				int d = tmp[1];
				cnt += d;
				for (int n : graph[x]) {
					if (!checked[n]) {
						checked[n] = true;
						Q.add(new int[] { n, d + 1 });
					}
				}
			}
			if (min > cnt) {
				min = cnt;
				who = i;
			}
		}
		System.out.println(who);
	}
}