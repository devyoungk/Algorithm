import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		boolean[] B = new boolean[1000001];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			B[arr[i]] = true;
		}

		int x = sc.nextInt();

		int cnt = 0;

		for (int a : arr) {
			if (x - a < 0 || x - a > 1000000)
				continue;
			if (B[x - a]) {
				cnt++;
			}
		}
		System.out.println(cnt / 2);
	}
}