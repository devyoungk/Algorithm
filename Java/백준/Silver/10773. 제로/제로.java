import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		Stack<Integer> S = new Stack<>();

		for (int i = 0; i < K; i++) {
			int n = sc.nextInt();
			if (n == 0) {
				S.pop();
			} else {
				S.add(n);
			}
		}

		int sum = 0;

		while (!S.isEmpty()) {
			sum += S.pop();
		}

		System.out.println(sum);
	}
}