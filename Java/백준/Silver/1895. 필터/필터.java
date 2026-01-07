import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[R][C];
		
		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < C; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int T = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for (int i = 0; i < R - 2; i++) {
			for (int j = 0; j < C - 2; j++) {
				int[] filter = new int[9];
				int idx = 0;
				for (int r = 0; r < 3; r++) {
					for (int c = 0; c < 3; c++) {
						filter[idx++] = A[i+r][j+c];
					}
				}
				Arrays.sort(filter);
				if (filter[4] >= T) cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
