import java.util.*;
import java.io.*;

public class Main {
	static int N, M, cnt;
	static List<Integer>[] graph;
	static boolean[] checked;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N+1];

		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}

		checked = new boolean[N + 1];
		cnt = 0;
		bfs();
		System.out.println(cnt);
	}

	static void bfs() {
		Queue<Integer> Q = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) {
			if (checked[i]) {
				continue;
			}
			cnt++;
			checked[i] = true;
			Q.offer(i);
			while (!Q.isEmpty()) {
				int x = Q.poll();
				for (int a : graph[x]) {
					if (!checked[a]) {
						checked[a] = true;
						Q.offer(a);
					}
				}
			}
		}
	}
}
