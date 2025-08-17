import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[] A = new int[N + 1];

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			int c = sc.nextInt();
			A[c] = p;
		}

		List<Integer> xp = new ArrayList<>();
		List<Integer> yp = new ArrayList<>();

		xp.add(x);
		while (A[x] != 0) {
			int px = A[x];
			xp.add(px);
			x = px;
		}

		int cp = 0;
		yp.add(y);
		if (xp.contains(y)) {
			cp = y;
		} else {
			while (A[y] != 0) {
				int py = A[y];
				yp.add(py);
				if (xp.contains(py)) {
					cp = py;
					break;
				}
				y = py;
			}
		}

		if (cp == 0) {
			System.out.println(-1);
			return;
		}

		System.out.println(xp.indexOf(cp) + yp.indexOf(cp));

	}
}