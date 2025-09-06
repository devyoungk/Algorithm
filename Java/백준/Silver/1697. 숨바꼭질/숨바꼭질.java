import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<int[]> Q = new ArrayDeque<>();

		boolean[] visited = new boolean[100001];

		Q.offer(new int[] { N, 0 });
		visited[N] = true;
		while (!Q.isEmpty()) {
			int[] tmp = Q.poll();
			int x = tmp[0];
			int d = tmp[1];
			if (x == K) {
				System.out.println(d);
				return;
			}
			if (x * 2 <= 100000 && !visited[x * 2]) {
				Q.offer(new int[] { x * 2, d + 1 });
				visited[x * 2] = true;
			}
			if (x + 1 <= 100000 && !visited[x + 1]) {
				Q.offer(new int[] { x + 1, d + 1 });
				visited[x + 1] = true;
			}
			if (x - 1 >= 0 && !visited[x - 1]) {
				Q.offer(new int[] { x - 1, d + 1 });
				visited[x - 1] = true;
			}
		}
	}
}