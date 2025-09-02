import java.util.*;

public class Main {
	static int N;
	static int[][] A;
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
		
		int K = sc.nextInt();
		
		List<int[]>[] graph = new ArrayList[V + 1];
		int[] D = new int[V + 1];
		
		Arrays.fill(D, Integer.MAX_VALUE);
		
		for (int i = 1; i <= V; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			
			graph[u].add(new int[] {v,w});
		}
		
		PriorityQueue<int[]> Q = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[1], o2[1]));
		Q.offer(new int[] {K,0});
		D[K] = 0;
		
		while (!Q.isEmpty()) {
			int[] tmp = Q.poll();
			int cur = tmp[0];
			int distance = tmp[1];
			
			if (D[cur] < distance) {
				continue;
			}
			for (int[] N : graph[cur]) {
				int next = N[0];
				int d = N[1];
				
				if (D[next] > D[cur] + d) {
					D[next] = D[cur] + d;
					Q.offer(new int[] {next, D[next]});
				}
			}
		}
		for (int i = 1; i <= V; i++) {
            if (D[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(D[i]);
            }
        }
	}
}
