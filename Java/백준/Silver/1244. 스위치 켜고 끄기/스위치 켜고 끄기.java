import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] sw = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			sw[i] = sc.nextInt();
		}
		int X = sc.nextInt();
		for (int i = 0; i < X; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			if (s == 1) {
				for (int j = t; j <= N; j += t) {
					sw[j] = sw[j] == 1 ? 0 : 1;
				}
			} else {
				int idx = 1;
				while (t - idx > 0 && t + idx <= N && sw[t - idx] == sw[t + idx]) {
					idx++;
				}
				idx--;
				for (int j = t - idx; j <= t + idx; j++) {
					sw[j] = sw[j] == 1 ? 0 : 1;
				}
			}
		}
		int cnt = 0;
		for (int i=1; i <= N; i++) {
			System.out.print(sw[i] + " ");
			cnt++;
			if (cnt==20) {
				System.out.println();
				cnt = 0;
			}
		}
	}
}