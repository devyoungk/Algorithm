import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] cnt0 = new int[41];
		int[] cnt1 = new int[41];

		cnt0[0] = 1;
		cnt1[1] = 1;

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			if (cnt0[N] != 0 && cnt1[N] != 0) {
				System.out.println(cnt0[N] + " " + cnt1[N]);
			} else {
				for (int i = 2; i <= N; i++) {
					cnt0[i] = cnt0[i - 1] + cnt0[i - 2];
					cnt1[i] = cnt1[i - 1] + cnt1[i - 2];
				}
				System.out.println(cnt0[N] + " " + cnt1[N]);
			}
		}
	}
}