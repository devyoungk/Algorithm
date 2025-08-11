import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int r = N/4;
			String S = sc.next();
			char[] C = new char[N + r - 1];

			for (int i = 0; i < N; i++) {
				C[i] = S.charAt(i);
			}
			for (int i = 0; i < r - 1; i++) {
				C[N+i] = C[i];
			}

			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < 4; j++) {
					String x = "";
					for (int k = 0; k < r; k++) {
						x += C[i + r * j + k];
					}
					int n = Integer.valueOf(x, 16);
					if (!list.contains(n)) {
						list.add(n);
					}
				}
			}
			Collections.sort(list);
			
			int ans = list.get(list.size()-K);
			System.out.println("#" + t + " " + ans);
		}
	}
}