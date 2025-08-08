import java.util.*;

public class Main {
	static int N, M, V;
	static int[][] graph;
	static boolean[] visited;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		graph = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			graph[a][b] = graph[b][a] = 1;
		}

		visited = new boolean[N + 1];
		dfs(1);
		System.out.println(cnt-1);

	}

	public static void dfs(int node) {
		visited[node] = true;

		cnt++;

		for (int next = 1; next <= N; next++) {
			if (graph[node][next] == 1 && !visited[next]) {
				dfs(next);
			}
		}
	}

}
