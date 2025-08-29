import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Queue<Integer> Q = new ArrayDeque<>();
		for (int i = 1; i <= n; i++) {
			Q.add(i);
		}
		Stack<Integer> S = new Stack<>();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			while (!Q.isEmpty() && Q.peek() <= x) {
				S.add(Q.poll());
				sb.append('+').append("\n");
			}
			while (!S.isEmpty() && S.peek() == x) {
				S.pop();
				sb.append('-').append("\n");
			}
			if (!S.isEmpty() && S.peek() > x) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println(sb);
	}
}