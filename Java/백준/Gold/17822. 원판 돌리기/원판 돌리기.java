import java.util.*;
import java.io.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int N, M, T;
	static int[][] A;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());

		A = new int[N + 1][M];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			for (int j = x; j <= N; j += x) {
				A[j] = rotate(A[j], d, k);
			}
			
			if (bfs()) continue;
			
			avgAdjust();
		}
		System.out.println(sumAll());
	}

	// 배열 회전 함수
	static int[] rotate(int[] now, int d, int k) {
		int[] next = new int[M];
		k %= M;
		if (d == 1)
			k *= -1;
		for (int i = 0; i < M; i++) {
			int idx = (i - k) % M;
			if (idx < 0)
				idx += M;
			next[i] = now[idx];
		}
		return next;
	}

	// bfs 함수 -> 제거할 수가 있으면 true
	static boolean bfs() {
		boolean remove = false;

		boolean[][] visited = new boolean[N + 1][M];

		Queue<int[]> Q = new ArrayDeque<>();

		for (int r = 1; r <= N; r++) {
			for (int c = 0; c < M; c++) {
				if (A[r][c] == 0 || visited[r][c])
					continue;

				int val = A[r][c];
				ArrayList<int[]> comp = new ArrayList<>();

				visited[r][c] = true;
				Q.offer(new int[] { r, c });
				comp.add(new int[] { r, c });

				while (!Q.isEmpty()) {
					int[] cur = Q.poll();
					int r0 = cur[0];
					int c0 = cur[1];

					for (int d = 0; d < 4; d++) {

						int nr = r0 + dir[d][0];
						int nc = c0 + dir[d][1];

						if (nc < 0)
							nc += M;
						if (nc >= M)
							nc -= M;

						if (nr < 1 || nr > N || visited[nr][nc] || A[nr][nc] != val)
							continue;

						visited[nr][nc] = true;
						Q.offer(new int[] { nr, nc });
						comp.add(new int[] { nr, nc });
					}
				}
				if (comp.size() >= 2) {
				    remove = true;
				    for (int[] p : comp) A[p[0]][p[1]] = 0;
				}
			}
		}
		return remove;
	}
	
	static void avgAdjust() {
	    long sum = 0;
	    int cnt = 0;

	    for (int i=1;i<=N;i++)
	      for (int j=0;j<M;j++)
	        if (A[i][j] != 0) { sum += A[i][j]; cnt++; }

	    if (cnt == 0) return;

	    double avg = (double) sum / cnt;

	    for (int i=1;i<=N;i++)
	      for (int j=0;j<M;j++)
	        if (A[i][j] != 0) {
	            if (A[i][j] > avg) A[i][j]--;
	            else if (A[i][j] < avg) A[i][j]++;
	        }
	}
	
	static int sumAll() {
	    int s = 0;
	    for (int i=1;i<=N;i++)
	      for (int j=0;j<M;j++)
	        s += A[i][j];
	    return s;
	}
}
