import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int s = (int) Math.pow(2, N);

		System.out.println(sol(s, r, c));
	}

	static int sol(int N, int r, int c) {
		if (N == 1)
			return 0;

		int half = N / 2;
		int size = half * half;

		if (r < half && c < half)
			return sol(N / 2, r, c);
		else if (r < half && c >= half)
			return size + sol(N / 2, r, c - half);
		else if (r >= half && c < half)
			return size * 2 + sol(N / 2, r - half, c);
		else
			return size * 3 + sol(N / 2, r - half, c - half);
	}
}
