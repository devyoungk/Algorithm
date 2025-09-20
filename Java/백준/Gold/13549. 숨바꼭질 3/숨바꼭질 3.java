import java.util.*;
import java.io.*;

public class Main {
	static int K, N, ans;
	static Deque<Integer> Q, nextQ;
	static boolean[] checked;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		if (N >= K) {
			System.out.println(N - K);
			return;
		}

		Q = new ArrayDeque<>();
		
		checked = new boolean[1000001];
		
		Q.offer(K);
		checked[K] = true;
		while(K % 2 == 0 && K > N && !checked[K / 2]) {
			K /= 2;
			Q.offer(K);
			checked[K] = true;
		}
		
		int ans = 0;
		
		while(!Q.isEmpty()) {
			int l = Q.size();
			for (int i = 0; i < l; i++) {
				int x = Q.poll();
				if (x == N) {
					System.out.println(ans);
					return;
				}
				if (!checked[x - 1]) {
					Q.offer(x - 1);
					checked[x - 1] = true;
				}
				int k = x - 1;
				while(k % 2 == 0 && k > N && !checked[k / 2]) {
					k /= 2;
					Q.offer(k);
				}
				if (!checked[x + 1]) {
					Q.offer(x + 1);
					checked[x + 1] = true;
				}
				k = x + 1;
				while(k % 2 == 0 && k > N && !checked[k / 2]) {
					k /= 2;
					Q.offer(k);
				}
			}
			ans++;
		}
	}
}
