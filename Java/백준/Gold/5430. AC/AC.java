import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		next: for (int t = 0; t < T; t++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String S = br.readLine();
			S = S.substring(1, S.length() - 1);
			String[] X = S.split(",");

			Deque<String> D = new ArrayDeque<>();
			for (String x : X) {
				if (!x.equals(""))
					D.offer(x);
			}

			boolean R = false;
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) == 'R') {
					R = R ? false : true;
				} else {
					if (D.isEmpty()) {
						System.out.println("error");
						continue next;
					}
					if (R) {
						D.pollLast();
					} else {
						D.pollFirst();
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			if (R) {
				while (!D.isEmpty()) {
					sb.append(D.pollLast()).append(",");
				}
			} else {
				while (!D.isEmpty()) {
					sb.append(D.pollFirst()).append(",");
				}
			}
			if (sb.length() > 1)
				sb.deleteCharAt(sb.length() - 1);
			sb.append("]");
			System.out.println(sb);
		}
	}
}
