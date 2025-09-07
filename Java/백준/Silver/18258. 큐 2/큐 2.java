import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int head = 0;
		int tail = 0;

		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			if (S.equals("push")) {
				A[tail++] = Integer.parseInt(st.nextToken());
			} else if (S.equals("pop")) {
				if (head == tail) {
					sb.append(-1).append('\n');
				} else {
					sb.append(A[head++]).append('\n');
				}
			} else if (S.equals("size")) {
				sb.append(tail - head).append('\n');
			} else if (S.equals("empty")) {
				if (head == tail) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
			} else if (S.equals("front")) {
				if (head == tail) {
					sb.append(-1).append('\n');
				} else {
					sb.append(A[head]).append('\n');
				}
			} else if (S.equals("back")) {
				if (head == tail) {
					sb.append(-1).append('\n');
				} else {
					sb.append(A[tail - 1]).append('\n');
				}
			}
		}
		System.out.println(sb);
	}
}