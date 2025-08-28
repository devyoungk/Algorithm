import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		List<Integer> A = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			A.add(i);
		}

		int idx = -1;

		List<Integer> answer = new LinkedList<>();

		while (!A.isEmpty()) {
			int l = A.size();
			idx = (idx + K) % l;
			answer.add(A.remove(idx--));
		}

		StringBuilder sb = new StringBuilder();
		sb.append('<');
		for (int i = 0; i < N - 1; i++) {
			sb.append(answer.get(i));
			sb.append(", ");
		}
		sb.append(answer.get(N - 1));
		sb.append('>');

		System.out.println(sb);
	}
}
