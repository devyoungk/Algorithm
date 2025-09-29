import java.io.*;
import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder(); 
	
	static int x, y; // x: 1, y: 0

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] A = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String S = br.readLine();
			for (int j = 0; j < N; j++) {
				A[i][j] = S.charAt(j) - '0';
			}
		}
		
		sol(A);
		
		System.out.println(sb);
		
	}

	static void sol(int[][] arr) {
		if (check(arr)) {
			return;
		}
		int l = arr.length;
		sb.append('(');
		for (int i = 0; i < l; i += l/2) {
			for (int j = 0; j < l; j += l/2) {
				int[][] tmp = new int[l/2][l/2];
				for (int r = 0; r < l/2; r++) {
					for (int c = 0; c < l/2; c++) {
						tmp[r][c] = arr[i+r][j+c];
					}
				}
				sol(tmp);
			}
		}
		sb.append(')');
	}
	
	static boolean check(int[][] arr) {
		int l = arr.length;
		int n = arr[0][0];
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (arr[i][j] != n)
					return false;
			}
		}
		switch (n) {
		case 1: 
			sb.append(1);
			break;
		case 0:
			sb.append(0);
			break;
		}
		return true;
	}
}
