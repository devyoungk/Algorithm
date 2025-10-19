import java.util.*;
import java.io.*;

public class Main {
	static int[][] dice = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		

		int[][] dir = { {}, { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < K; i++) {
			int a = Integer.parseInt(st.nextToken());
			int nx = x + dir[a][0];
			int ny = y + dir[a][1];
			
			if (nx < 0 || nx >= N || ny < 0 || ny >= M)
				continue;
			
			x = nx;
			y = ny;
			roll(a);
			
			if (map[x][y] == 0) {
				map[x][y] = dice[3][1];
			} else {
				dice[3][1] = map[x][y];
				map[x][y] = 0;
			}
			
			System.out.println(dice[1][1]);
		}
	}

	static void roll(int a) {
		int tmp;
		switch (a) {
		case 1:
			tmp = dice[1][2];
			dice[1][2] = dice[1][1];
			dice[1][1] = dice[1][0];
			dice[1][0] = dice[3][1];
			dice[3][1] = tmp;
			break;
		case 2:
			tmp = dice[1][0];
			dice[1][0] = dice[1][1];
			dice[1][1] = dice[1][2];
			dice[1][2] = dice[3][1];
			dice[3][1] = tmp;
			break;
		case 3:
			tmp = dice[0][1];
			dice[0][1] = dice[1][1];
			dice[1][1] = dice[2][1];
			dice[2][1] = dice[3][1];
			dice[3][1] = tmp;
			break;
		case 4:
			tmp = dice[3][1];
			dice[3][1] = dice[2][1];
			dice[2][1] = dice[1][1];
			dice[1][1] = dice[0][1];
			dice[0][1] = tmp;
			break;
		}
		return;
	}
}
