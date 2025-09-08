import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Deque<Integer> D = new ArrayDeque<>();

		for (int i = 1; i <= N; i++) {
			D.offer(i);
		}

		int ans = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (a == D.peekFirst()) {
				D.pollFirst();
				continue;
			}
			int cnt = 0;
			while (D.peekFirst() != a) {
				D.offerLast(D.pollFirst());
				cnt++;
			}
			if (cnt > D.size() / 2) 
				cnt = D.size() - cnt;
			ans += cnt;
			D.pollFirst();
		}
		System.out.println(ans);
	}
}
