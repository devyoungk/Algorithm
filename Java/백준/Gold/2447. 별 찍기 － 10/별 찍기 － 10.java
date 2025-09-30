import java.io.*;
import java.util.*;

public class Main {
	static char[][] star = {{'*', '*', '*'},{'*', ' ', '*'},{'*', '*', '*'}};
	static int N;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		sol(star);
	}

	static void sol(char[][] C) {
		int l = C.length;
		if (l == N) {
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < l; j++) {
					sb.append(C[i][j]);
				}
				sb.append('\n');
			}
			System.out.println(sb);
			return;
		}
		char[][] tmp = new char[l*3][l*3];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				for (int r = i; r < l*3; r+=l) {
					for (int c = j; c < l*3; c+=l) {
						if (r >= l && r < l*2 && c >= l && c < l*2)
							tmp[r][c] = ' ';
						else
							tmp[r][c] = C[i][j];
					}
				}
			}
		}
		sol(tmp);
	}
}
