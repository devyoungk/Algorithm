import java.util.*;

public class Solution {
	static List<Integer>[] graph;
	static boolean[] visited;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			graph = new List[N + 1];
			visited = new boolean[N + 1];
			cnt = 0;
			for (int i = 0; i <= N; i++) {
				graph[i] = new ArrayList<>();
			}
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				graph[a].add(b);
				graph[b].add(a);
			}

			bfs(2);
			System.out.println("#" + t + " " + cnt);
		}
	}

	static void bfs(int d) {
		Queue<int[]> Q = new ArrayDeque<>();
		visited[1] = true;
		Q.offer(new int[] { 1, 0 });
		while (!Q.isEmpty()) {
			int[] X = Q.poll();
			if (X[1] >= d) {
				return;
			}
			for (int a : graph[X[0]]) {
				if (visited[a]) {
					continue;
				}
				visited[a] = true;
				cnt++;
				Q.offer(new int[] { a, X[1] + 1 });
			}
		}
	}
}