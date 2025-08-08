import java.util.*;

public class Main {
	static int N, M, V;
	static int[][] graph;
	static boolean[] visited;
	static Queue<Integer> queue = new ArrayDeque<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();

		graph = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			graph[a][b] = graph[b][a] = 1;
		}

		visited = new boolean[N + 1];
		dfs(V);

		System.out.println();

		visited = new boolean[N + 1];
		bfs(V);
	}

	public static void dfs(int node) {
		visited[node] = true;

		System.out.print(node + " ");

		for (int next = 1; next <= N; next++) {
			if (graph[node][next] == 1 && !visited[next]) {
				dfs(next);
			}
		}
	}

	public static void bfs(int node) {
		queue.add(node);
		visited[node] = true;

		System.out.print(node + " ");

		while (!queue.isEmpty()) {
			int tmp = queue.poll();

			for (int next = 1; next <= N; next++) {
				if (graph[tmp][next] == 1 && !visited[next]) {
					queue.add(next);
					visited[next] = true;
					System.out.print(next + " ");
				}
			}
		}
	}
}
