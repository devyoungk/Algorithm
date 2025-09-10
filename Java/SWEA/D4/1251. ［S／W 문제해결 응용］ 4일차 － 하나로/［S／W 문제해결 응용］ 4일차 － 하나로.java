import java.util.*;

public class Solution {
	static int N, M;
	static int[] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			double[] X = new double[N];
			double[] Y = new double[N];
			for (int i = 0; i < N; i++) {
				X[i] = sc.nextDouble();
			}
			for (int i = 0; i < N; i++) {
				Y[i] = sc.nextDouble();
			}
			Edge[] edges = new Edge[N * (N - 1) / 2];
			int idx = 0;
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					double ll = (X[i] - X[j]) * (X[i] - X[j]) + (Y[i] - Y[j]) * (Y[i] - Y[j]);
					edges[idx++] = new Edge(i, j, ll);
				}
			}

			Arrays.sort(edges);

			p = new int[N];

			for (int i = 0; i < N; i++) {
				makeSet(i);
			}

			double ans = 0;
			double E = sc.nextDouble();

			for (int i = 0, pick = 0; i < N * (N - 1) / 2 && pick < N - 1; i++) {
				int px = findSet(edges[i].from);
				int py = findSet(edges[i].to);
				if (px != py) {
					p[py] = px;
					pick++;
					ans += edges[i].ll;
				}
			}

			long A = Math.round(ans * E);
			System.out.println("#" + t + " " + A);
		}
	}

	static class Edge implements Comparable<Edge> {
		int from, to;
		double ll;

		public Edge(int from, int to, double ll) {
			this.from = from;
			this.to = to;
			this.ll = ll;
		}

		@Override
		public int compareTo(Edge o) {
			return Double.compare(this.ll, o.ll);
		}

	}

	static void makeSet(int x) {
		p[x] = x;
	}

	static int findSet(int x) {
		if (x != p[x])
			p[x] = findSet(p[x]);
		return p[x];
	}

	static void union(int x, int y) {
		p[findSet(y)] = findSet(x);
	}
}
