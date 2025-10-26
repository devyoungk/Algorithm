import java.util.*;
import java.io.*;

public class Main {
	static int[][] dir = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } }; // 북 동 남 서

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Deque<int[]> Q = new ArrayDeque<>();
		Q.offer(new int[] { r, c });
		map[r][c] = 2; // 청소 완료

		int ans = 1;

		next: while (!Q.isEmpty()) {
			int[] tmp = Q.poll();
			int x = tmp[0];
			int y = tmp[1];

			for (int i = 1; i <= 4; i++) {
				int idx = (4 + d - i) % 4; // 90도 반시계 회전
				int nx = x + dir[idx][0];
				int ny = y + dir[idx][1];
				
				if (nx < 0 || nx >= N || ny < 0 || ny >= M)
					continue;
				
				if (map[nx][ny] == 0) {
					Q.offer(new int[] {nx, ny});
					map[nx][ny] = 2;
					ans++;
					d = idx;
					continue next;
				}
			}
			
			int nx = x - dir[d][0];
			int ny = y - dir[d][1];
			
			if (nx < 0 || nx >= N || ny < 0 || ny >= M || map[nx][ny] == 1)
				break;
			
			Q.offer(new int[] {nx, ny});
		}
		
		System.out.println(ans);
	}
}
