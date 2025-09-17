import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] A = new int[N + 1];
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}

			boolean[] checked = new boolean[N + 1];
			boolean[] visited = new boolean[N + 1];

			for (int i = 1; i <= N; i++) {
				if (visited[i])
					continue;
				Set<Integer> currentPath = new HashSet<>();
				int cur = i;
				
				while (true) {
					if (visited[cur]) {
						if (currentPath.contains(cur)) {
							int cycleStartNode = cur;
							while (!checked[cycleStartNode]) {
								checked[cycleStartNode] = true;
								cycleStartNode = A[cycleStartNode];
							}
						}
						break;
					}
					visited[cur] = true;
					currentPath.add(cur);
					cur = A[cur];
				}
			}
			
			int cnt = 0;
			for (int j = 1; j <= N; j++) {
                if (!checked[j])
                    cnt++;
            }
			System.out.println(cnt);
		}
	}
}
