import java.io.*;
import java.util.*;

public class Main {
	static char[][] star = { { ' ', ' ', '*', ' ', ' ' }, { ' ', '*', ' ', '*', ' ' }, { '*', '*', '*', '*', '*' } };
	static int N;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		sol(star);
	}

	static void sol(char[][] C) {
		int h = C.length;
		int w = 2 * h - 1;
		if (h == N) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					sb.append(C[i][j]);
				}
				sb.append('\n');
			}
			System.out.println(sb);
			return;
		}
		int nh = 2 * h;
		int nw = 2 * nh - 1;
		
		char[][] tmp = new char[nh][nw];
		
		for (int i = 0; i < nh; i++) {
			Arrays.fill(tmp[i], ' ');
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				tmp[i][j + h] = C[i][j];
				tmp[i + h][j] = C[i][j];
				tmp[i + h][j + 2 * h] = C[i][j];
			}
		}
		sol(tmp);
	}
}
