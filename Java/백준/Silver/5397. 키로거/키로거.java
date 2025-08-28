import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String S = sc.next();
			int L = S.length();
			Deque<Character> left = new ArrayDeque<>();
			Deque<Character> right = new ArrayDeque<>();

			for (int j = 0; j < L; j++) {
				char c = S.charAt(j);
				if (c == '<') {
					if (!left.isEmpty()) {
						right.offerFirst(left.pollLast());
					}
				} else if (c == '>') {
					if (!right.isEmpty()) {
						left.offerLast(right.pollFirst());
					}
				} else if (c == '-') {
					if (!left.isEmpty()) {
						left.pollLast();
					}
				} else {
					left.offerLast(c);
				}
			}

			StringBuilder sb = new StringBuilder();
			for (char c : left) sb.append(c);
			for (char c : right) sb.append(c);
			System.out.println(sb);
		}
	}
}
