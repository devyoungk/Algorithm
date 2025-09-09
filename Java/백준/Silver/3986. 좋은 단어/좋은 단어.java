import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			String S = br.readLine();

			Deque<Character> Stack = new ArrayDeque<>();

			int L = S.length();
			if (L % 2 == 1)
				continue;

			for (int j = 0; j < L; j++) {
				char c = S.charAt(j);
				if (Stack.isEmpty() || Stack.peek() != c)
					Stack.push(c);
				else {
					Stack.pop();
				}
			}
			if (Stack.isEmpty())
				cnt++;
		}
		System.out.println(cnt);
	}
}
