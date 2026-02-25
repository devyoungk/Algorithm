import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[] A;
	static boolean[] visited, finished;
	static List<Integer> ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		A = new int[N + 1];
		visited = new boolean[N + 1];
		finished = new boolean[N + 1];
		ans = new ArrayList<>();
		
		for (int i = 1; i <= N ; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				dfs(i);
			}
		}
		
		Collections.sort(ans);
		
		StringBuilder sb = new StringBuilder();
		int l = ans.size();
		sb.append(l).append("\n");
		for (int i = 0; i < l; i++) {
			sb.append(ans.get(i)).append("\n");
		}
		System.out.println(sb);
	}
	
	static void dfs(int u) {
		visited[u] = true;
		int v = A[u];
		
		if (!visited[v]) {
			dfs(v);
		} else if (!finished[v]) {
			int cur = v;
			while (cur != u) {
				ans.add(cur);
				cur = A[cur];
			}
			ans.add(u);
		}
		
		finished[u] = true;
	}
}
